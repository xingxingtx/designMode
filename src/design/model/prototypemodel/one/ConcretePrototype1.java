package design.model.prototypemodel.one;

/**
 * Created by Administrator on 2018/8/14.
 */
public class ConcretePrototype1 implements Prototype{
    @Override
    public Object clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
