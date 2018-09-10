package design.model.templatemodel.two;

/**
 * Created by Administrator on 2018/9/10.
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {

        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {

        return 0.045;
    }

}
