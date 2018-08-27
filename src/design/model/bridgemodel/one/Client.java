package design.model.bridgemodel.one;

/**
 * Created by Administrator on 2018/8/27.
 */
public class Client {
    public static void main(String[] args) {
                AreaA a = new AreaA2();
                a.bridge = new AreaB3();
                a.fromAreaA();
                a.bridge.targetAreaB();
    }
}
