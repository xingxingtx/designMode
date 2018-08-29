package design.model.mediatormodel.one;

/**
 * Created by Administrator on 2018/8/29.
 */
public class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }

}
