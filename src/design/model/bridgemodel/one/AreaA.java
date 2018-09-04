package design.model.bridgemodel.one;

/**
 * Created by wei.peng on 2018/8/27.
 */
public abstract class AreaA {
    //引用桥接口
    Bridge bridge;
     //来源地
    abstract void fromAreaA();
}
