package design.model.componentmodel.two;

/**
 * Created by wei.peng on 2018/8/16.
 * ● AbstractFile（抽象构件）
 * ● TextFile（叶子构件）
 * ● Composite（容器构件）
 * （透明组合模式）
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();

    public abstract void operation();
}
