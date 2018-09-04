package design.model.statemodel.one;

/**
 * Created by Administrator on 2018/9/4.
 * 抽象状态类
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
