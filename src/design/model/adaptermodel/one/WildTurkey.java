package design.model.adaptermodel.one;

/**
 * Created by wei.peng on 2018/8/2.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("i can flying a short distance");
    }
}
