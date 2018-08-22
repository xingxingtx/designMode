package design.model.responsibilitychainmodel.one;

import javax.servlet.Filter;
import javax.servlet.FilterChain;

/**
 * Created by Administrator on 2018/8/22.
 */
public class Client {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }

}
