package design.model.statemodel.two;

/**
 * Created by wei.peng on 2018/9/4.
 */
public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
