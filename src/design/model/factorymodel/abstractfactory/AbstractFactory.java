package design.model.factorymodel.abstractfactory;

/**
 * Created by Administrator on 2018/7/30.
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public abstract Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    public abstract MainBoard createMainBoard();
}
