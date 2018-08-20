package design.model.facadepattern.one;

/**
 * Created by Administrator on 2018/8/20.
 * 正方形
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
