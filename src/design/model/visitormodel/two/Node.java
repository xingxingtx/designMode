package design.model.visitormodel.two;

/**
 * Created by wei.peng on 2018/9/7.
 */
public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
