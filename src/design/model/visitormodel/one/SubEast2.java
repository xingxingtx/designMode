package design.model.visitormodel.one;

/**
 * Created by wei.peng on 2018/9/7.
 */
public class SubEast2 extends East{
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }

    public String myName2(){
        return "SubEast2";
    }
}
