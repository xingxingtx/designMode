package design.model.flyweightpattern.one;

/**
 * Created by Administrator on 2018/8/20.
 */
public class MainTest {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");

    }
}
