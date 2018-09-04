package design.model.adaptermodel.one;

/**
 * Created by wei.peng on 2018/8/2.
 */
public class DuckTestDriver {
    public static void main(String[] args){
        MallardDuck mDuck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck duck= new TurkeyAdapter(turkey);
        System.out.println();
    }
}
