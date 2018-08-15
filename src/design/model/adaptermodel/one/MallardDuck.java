package design.model.adaptermodel.one;

/**
 * Created by Administrator on 2018/8/2.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("i'am flying");
    }
}
