package design.model.componentmodel.one;

/**
 * Created by wei.peng on 2018/8/16.
 * 文件（灰色节点）和文件夹（白色节点）两类不同的元素，其中在文件夹中可以包含文件，还可以继续包含子文件夹，
 * 但是在文件中不能再包含子文件或者子文件夹。在此，我们可以称文件夹为容器(Container)，而不同类型的各种文件是其成员，
 * 也称为叶子(TextFile)，一个文件夹也可以作为另一个更大的文件夹的成员。
 */
public class ImageFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }
    public void killVirus() {
        //简化代码，模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }

}

