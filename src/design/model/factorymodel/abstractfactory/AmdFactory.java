package design.model.factorymodel.abstractfactory;

/**
 * Created by wei.peng on 2018/7/30.
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {

        return (Cpu)new IntelCpu(938);
    }

    @Override
    public MainBoard createMainBoard() {
        return (MainBoard)new IntelMainBoard(938);
    }
}