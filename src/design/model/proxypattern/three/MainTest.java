package design.model.proxypattern.three;

/**
 * Created by wei.peng on 2018/8/21.
 */
public class MainTest {

    public static void main(String[] args){
        //目标对象
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
