package design.model.statemodel.one;

/**
 * Created by Administrator on 2018/9/4.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }

}
