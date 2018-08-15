package design.model.decoratormodel.one;

/**
 * Created by Administrator on 2018/7/26.
 */
public class Mocha  extends CondimentDecorator {
    Beverage beverage;
    public double prices = 0.8;
    public Mocha() {
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + getPrices();
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
}
