package design.model.componentmodel.two;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/8/16.
 *  ● Composite（容器构件）
 */
public class Composite extends AbstractFile {
    private ArrayList<AbstractFile> list = new ArrayList<AbstractFile>();

    public void add(AbstractFile c) {
        list.add(c);
    }

    public void remove(AbstractFile c) {
        list.remove(c);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile)list.get(i);
    }

    public void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for(Object obj:list) {
            ((AbstractFile)obj).operation();
        }
    }
}
