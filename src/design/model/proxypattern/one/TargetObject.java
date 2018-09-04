package design.model.proxypattern.one;

/**
 * Created by wei.peng on 2018/8/21.
 * 目标对象
 */
public class TargetObject implements AbsProxy{
    @Override
    public void add() {
        System.out.println("在目标对象中执行add");
    }

    @Override
    public void delete() {
        System.out.println("在目标对象中执行delete");
    }

    @Override
    public void update() {
        System.out.println("在目标对象中执行update");
    }

    @Override
    public void query() {
        System.out.println("在目标对象中执行query");
    }
}
