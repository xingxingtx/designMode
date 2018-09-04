package design.model.Singletonmodel;

/**
 * 饿汉式单例类
 * Created by wei.peng on 2018/7/31.
 */
public class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return singleton;
    }
}
