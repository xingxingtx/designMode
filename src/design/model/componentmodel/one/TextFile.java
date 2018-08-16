package design.model.componentmodel.one;

/**
 * Created by Administrator on 2018/8/16.
 */
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }
    public void killVirus() {
        //简化代码，模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
