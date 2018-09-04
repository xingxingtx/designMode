package design.model.decoratormodel.Three;

import java.util.Date;
import java.util.List;

/**
 * Created by wei.peng on 2018/7/27.
 */
public class DoubleColorBallLottery extends Lottery {
    //开奖时间
    private Date runLotteryTime;
    //购买时间
    private Date buyLotteryTime;
    //彩票期数集合
    private static List<String> lotteryPeriods;

    public DoubleColorBallLottery() {
        description = "双色球";
    }

    @Override
   public String getLotteryNumber() {
        return null;
    }
}
