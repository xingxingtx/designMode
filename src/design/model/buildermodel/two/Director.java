package design.model.buildermodel.two;

/**
 * Created by Administrator on 2018/8/13.
 */
public class Director {
    Builder builder;
    /**
     * 构造子
     */
    public Director(Builder builder){
        this.builder = builder;
    }
    /**
     * 产品构造方法，负责调用各零件的建造方法
     */
    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
