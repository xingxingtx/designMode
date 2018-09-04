package design.model.decoratormodel.one;

/**
 * Created by wei.peng on 2018/7/26.
 */
public class TestMain {

    public static void main(String[] args){
            Beverage beverage = new Espresso();
            System.out.println("咖啡类型："+beverage.getDescription() +"\n价格："+ beverage.cost());
            beverage = new Mocha(beverage);
            beverage = new Mocha(beverage);
            beverage = new Soy(beverage);
            System.out.println("咖啡类型："+beverage.getDescription() +"\n价格："+ beverage.cost());

    }
}
