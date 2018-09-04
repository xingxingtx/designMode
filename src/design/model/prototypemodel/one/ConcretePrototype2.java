package design.model.prototypemodel.one;

/**
 * Created by wei.peng on 2018/8/14.
 */
public class ConcretePrototype2 implements Prototype{
    @Override
    public Object clone() {
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
