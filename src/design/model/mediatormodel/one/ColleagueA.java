package design.model.mediatormodel.one;

/**
 * Created by Administrator on 2018/8/29.
 */
public class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }

}
