package design.model.decoratormodel.one;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public double prices = 0.9;

    public Soy() {
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
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