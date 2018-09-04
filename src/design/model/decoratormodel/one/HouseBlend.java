package design.model.decoratormodel.one;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 2.87;
    }
}
