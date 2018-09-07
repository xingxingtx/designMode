package design.model.visitormodel.one;

/**
 * Created by wei.peng on 2018/9/7.
 */
public class SubWest1 extends West{

    @Override
    public void goWest1(SubEast1 east) {

        System.out.println("SubWest1 + " + east.myName1());
    }

    @Override
    public void goWest2(SubEast2 east) {

        System.out.println("SubWest1 + " + east.myName2());
    }
}
