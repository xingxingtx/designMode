package design.model.responsibilitychainmodel.three;

import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2018/8/22.
 * 阈值解析处理器
 */
public class ThresholdParseHandler extends AbstractRuleHandler {

    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        if(StringUtils.isEmpty(rule.getThreshold())) {
            throw new Exception("Threshold is empty.");
        }
        System.out.println("Parse threshold success. Threshold is " + rule.getThreshold());
    }

    @Override
    public void rollBackReal(AlarmRule rule) {
        System.out.println("Roll parse threshold. Threshold is " + rule.getThreshold());
    }

}
