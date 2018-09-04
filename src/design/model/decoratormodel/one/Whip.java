package design.model.decoratormodel.one;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public double prices = 0.7;
    public Whip() {
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() + ",Whip";
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