package design.model.Singletonmodel;

/**
 * Created by Administrator on 2018/7/31.
 *懒汉式单例类
 */
public class LazySingleton {
    public static LazySingleton singleton = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
