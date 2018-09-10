package design.model.templatemodel.two;

/**
 * Created by Administrator on 2018/9/10.
 */
public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
