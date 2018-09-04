package design.model.responsibilitychainmodel.three;

/**
 * Created by wei.peng on 2018/8/22.
 * 流任务生成处理器
 */
public class StreamGenerateHandler extends AbstractRuleHandler {

    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        System.out.println("Generate stream success.");
    }

    @Override
    public void rollBackReal(AlarmRule rule) {
        System.out.println("Roll Generate stream.");
    }
}
