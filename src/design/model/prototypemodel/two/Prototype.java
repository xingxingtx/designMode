package design.model.prototypemodel.two;

/**
 * Created by wei.peng on 2018/8/14.
 */
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
