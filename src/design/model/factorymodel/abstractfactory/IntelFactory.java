package design.model.factorymodel.abstractfactory;

/**
 * Created by wei.peng on 2018/7/30.
 */
public class IntelFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return (Cpu) new IntelCpu(755);
    }

    @Override
    public MainBoard createMainBoard() {
        return (MainBoard)new IntelMainBoard(755);
    }
}