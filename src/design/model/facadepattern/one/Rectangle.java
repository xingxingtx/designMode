package design.model.facadepattern.one;

/**
 * Created by Administrator on 2018/8/20.
 * 矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}