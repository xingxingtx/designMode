package design.model.buildermodel.two;

/**
 * Created by Administrator on 2018/8/13.
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("toAddress@126.com", "fromAddress@126.com");

    }
}
