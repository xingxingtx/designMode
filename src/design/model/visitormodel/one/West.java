package design.model.visitormodel.one;

/**
 * Created by wei.peng on 2018/9/7.
 * 双重分派
 */
public abstract class West {
    public abstract void goWest1(SubEast1 east);

    public abstract void goWest2(SubEast2 east);
}
