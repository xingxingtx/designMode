package design.model.decoratormodel.one;

/**
 * Created by wei.peng on 2018/7/26.
 */
public abstract class Beverage {
     String description = "unknown beverage";

    public String getDescription(){
        return description;
    }

  public abstract double cost();
}
