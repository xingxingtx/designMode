package design.model.facadepattern.one;

/**
 * Created by wei.peng on 2018/8/20.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
