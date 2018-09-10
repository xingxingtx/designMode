package design.model.templatemodel.one;

/**
 * Created by Administrator on 2018/9/10.
 * 具体模板角色类
 */
public class ConcreteTemplate extends AbstractTemplate {
    //基本方法的实现
    @Override
    public void abstractMethod() {
        //业务相关的代码
    }
    //重写父类的方法
    @Override
    public void hookMethod() {
        //业务相关的代码
    }
}
