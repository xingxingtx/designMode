package design.model.decoratormodel.one;

/**
 * Created by Administrator on 2018/7/26.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
