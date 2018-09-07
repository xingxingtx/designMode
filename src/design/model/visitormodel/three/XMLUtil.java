package design.model.visitormodel.three;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.io.File;


/**
 * Created by wei.peng on 2018/9/7.
 */

//需要引入dom4j.jar，jaxen.jar两个JAR包
public class XMLUtil {
    public static Object getBean() throws Exception {
        SAXReader reader = new SAXReader();
        String path = XMLUtil.class.getClassLoader().
                getResource("design/model/visitormodel/three/config.xml").getPath();
        Document document = reader.read(new File(path));
        String cName = document.selectSingleNode("/config/className").getText();
        //通过类名生成实例对象并将其返回
        Class<?> c = Class.forName(cName);
        Object obj = c.newInstance();
        return obj;
    }

}
