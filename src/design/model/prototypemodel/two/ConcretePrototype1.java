package design.model.prototypemodel.two;

/**
 * Created by wei.peng on 2018/8/14.
 */
public class ConcretePrototype1 implements Prototype {
    private String name;
    public Prototype clone(){
        ConcretePrototype1 prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }
    public String toString(){
        return "Now in Prototype1 , name = " + this.name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
