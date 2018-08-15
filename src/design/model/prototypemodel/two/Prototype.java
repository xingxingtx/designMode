package design.model.prototypemodel.two;

/**
 * Created by Administrator on 2018/8/14.
 */
public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
