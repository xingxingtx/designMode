package design.model.iteratormodel.two;


import java.util.AbstractList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by wei.peng on 2018/8/28.
 */
public class Client {
    public static void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six","Seven"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {
        Client.operation();
    }
}
