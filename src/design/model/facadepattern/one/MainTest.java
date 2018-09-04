package design.model.facadepattern.one;

/**
 * Created by wei.peng on 2018/8/20.
 */
public class MainTest {
    public static void main(String[] args){
        ShapeFacade shapeFacade = new ShapeFacade();

        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
