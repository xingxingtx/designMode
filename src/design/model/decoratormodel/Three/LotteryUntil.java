package design.model.decoratormodel.Three;

/**
 * Created by Administrator on 2018/7/27.
 */
public class LotteryUntil {
    /*
    * 0+1,1+1,2+1  5
    *3+1,4+0 10
    *4+1,5+0 200
    *5+1 3000
    *6+0 最高500w
    * 6+1 最高1000w
    * */
    public static int getAward(String lotteryNumber, String buyNumber){
        lotteryNumber = lotteryNumber.trim();
        buyNumber = buyNumber.trim();

        return 0;
    }

    public static int getEqualsNumber(String[] lotteryNumber, String[] buyNumber){
        return 1;
    }
}
