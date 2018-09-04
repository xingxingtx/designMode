package design.model.mementomodel.one;

/**
 * Created by wei.peng on 2018/8/30.
 * 备忘录角色类，备忘录对象将发起人对象传入的状态存储起来。
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
