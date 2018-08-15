package design.model.Commandmodel.two;

/**
 * Created by Administrator on 2018/8/1.
 */
public interface MacroCommand  extends Command{
    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    public void add(Command cmd);
    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    public void remove(Command cmd);
}
