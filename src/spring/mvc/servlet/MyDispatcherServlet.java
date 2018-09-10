package spring.mvc.servlet;

import spring.mvc.annotation.MyController;
import spring.mvc.annotation.MyQuatifier;
import spring.mvc.annotation.MyRequestMapping;
import spring.mvc.annotation.MyService;
import spring.mvc.controller.SpringmvcController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wei.peng on 2018/8/20.
 */
@WebServlet("/MyDispatcherServlet")
public class MyDispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    List<String> packageNames = new ArrayList<String>();
    // 所有类的实例，key是注解的value,value是所有类的实例
    Map<String, Object> instanceMap = new HashMap<String, Object>();
    Map<String, Object> handerMap = new HashMap<String, Object>();
    public MyDispatcherServlet() {
        super();
    }

    @Override
    public void init() throws ServletException {
            scanPackage("spring.mvc");
        try {
            filterAndInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

// 建立映射关系
        handerMap();
        // 实现注入
        ioc();

    }
    private void filterAndInstance() throws Exception {
        if (packageNames.size() <= 0) {
            return;
        }
        for (String className : packageNames) {
            Class<?> cName = Class.forName(className.replace(".class", "").trim());
            if (cName.isAnnotationPresent(MyController.class)) {
                Object instance = cName.newInstance();
                MyController controller = (MyController) cName.getAnnotation(MyController.class);
                String key = controller.value();
                instanceMap.put(key, instance);
            } else if (cName.isAnnotationPresent(MyService.class)) {
                Object instance = cName.newInstance();
                MyService service = (MyService) cName.getAnnotation(MyService.class);
                String key = service.value();
                instanceMap.put(key, instance);
            } else {
                continue;
            }
        }
    }

    private void ioc() {
        if (instanceMap.isEmpty())
            return;
        for (Map.Entry<String, Object> entry : instanceMap.entrySet()) {
            // 拿到里面的所有属性
            Field fields[] = entry.getValue().getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);// 可访问私有属性
                if (field.isAnnotationPresent(MyQuatifier.class));
                MyQuatifier quatifier = field.getAnnotation(MyQuatifier.class);
                String value = quatifier.value();
                field.setAccessible(true);
                try {
                    field.set(entry.getValue(), instanceMap.get(value));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 建立映射关系
     */
    private void handerMap() {
        if (instanceMap.size() <= 0)
            return;
        for (Map.Entry<String, Object> entry : instanceMap.entrySet()) {
            if (entry.getValue().getClass().isAnnotationPresent(MyController.class)) {
                MyController controller = (MyController) entry.getValue().getClass().getAnnotation(MyController.class);
                String ctvalue = controller.value();
                Method[] methods = entry.getValue().getClass().getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(MyRequestMapping.class)) {
                        MyRequestMapping rm = (MyRequestMapping) method.getAnnotation(MyRequestMapping.class);
                        String rmvalue = rm.value();
                        handerMap.put("/" + ctvalue + "/" + rmvalue, method);
                    } else {
                        continue;
                    }
                }
            } else {
                continue;
            }

        }
    }

    /**
     * 扫描包下的所有文件
     *
     * @param Package
     */
    private void scanPackage(String Package) {
        URL url = this.getClass().getClassLoader().getResource("/" + replaceTo(Package));// 将所有的.转义获取对应的路径
        String pathFile = url.getFile();
        File file = new File(pathFile);
        String fileList[] = file.list();
        for (String path : fileList) {
            File eachFile = new File(pathFile + path);
            if (eachFile.isDirectory()) {
                scanPackage(Package + eachFile.getName());
            } else {
                packageNames.add(Package + "." + eachFile.getName());
            }
        }
    }
    private String replaceTo(String path) {
        return path.replaceAll("\\.", "/");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getRequestURI();
        String context = req.getContextPath();
        String path = url.replace(context, "");
        Method method = (Method) handerMap.get(path);
        SpringmvcController controller = (SpringmvcController) instanceMap.get(path.split("/")[1]);
        try {
            method.invoke(controller, new Object[] { req, resp, null });
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


}
