package design.model.factorymodel.simplefactory;

/**
 * Created by wei.peng on 2018/7/30.
 */
public class MainBoardFactory {
    public static MainBoard createMainboard(int type){
        MainBoard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainBoard(755);
        }else if(type == 2){
            mainboard = new AmdMainBoard(938);
        }
        return mainboard;
    }
}
