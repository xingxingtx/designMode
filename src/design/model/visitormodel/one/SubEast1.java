package design.model.visitormodel.one;

/**
 * Created by wei.peng on 2018/9/7.
 */
public class SubEast1 extends East{
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }

    public String myName1(){
        return "SubEast1";
    }
}
