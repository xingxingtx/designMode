package design.model.proxypattern.two;

import design.model.proxypattern.one.AbsProxy;
import design.model.proxypattern.one.TargetObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/8/21.
 */
public class MainTest {
    public static void main(String[] args) {
        // 目标对象
        TargetObject target = new TargetObject();
        // 【原始的类型 class com.zhong.UserDao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        Object o  =  new ProxyFactory(target){
            @Override
            public Object getProxyInstance() {
                Object object = Proxy.newProxyInstance(
                        target.getClass().getClassLoader(),
                        target.getClass().getInterfaces(),
                        new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


                        return null;
                    }
                });
                return object;
            }
        };
        if(o instanceof AbsProxy) {
            AbsProxy proxy = (AbsProxy)o;
            // class $Proxy0   内存中动态生成的代理对象
            System.out.println(proxy.getClass());
            // 执行方法【代理对象】
            proxy.add();
            proxy.delete();
            proxy.query();
            proxy.update();
        }
    }
}
