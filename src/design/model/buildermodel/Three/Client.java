package design.model.buildermodel.Three;

/**
 * Created by Administrator on 2018/8/13.
 */
public class Client {
    public static void main(String[]args){
        //创建构建器对象
        InsuranceContract builder =
                new InsuranceContract.ConcreteBuilder("9527", 123L, 456L)
                        .setPersonName("小明")
                        .setOtherData("test")
                        .build();
        builder.someOperation();
    }
}
