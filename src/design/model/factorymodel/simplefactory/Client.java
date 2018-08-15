package design.model.factorymodel.simplefactory;

/**
 * Created by Administrator on 2018/7/30.
 */
public class Client {
    public static void main(String[]args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(2,2);
    }
}
