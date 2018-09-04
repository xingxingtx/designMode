package design.model.responsibilitychainmodel.three;

import org.springframework.util.StringUtils;

/**规则入库处理器
 * Created by wei.peng on 2018/8/22.
 */
public class RulePesistHandler extends AbstractRuleHandler {

    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        if(StringUtils.isEmpty(rule.getName())) {
            throw new Exception("Rule name is empty.");
        }
        System.out.println("Persist rule success. Rule name is " + rule.getName());
    }

    @Override
    public void rollBackReal(AlarmRule rule) {
        System.out.println("Roll persist rule. Rule name is " + rule.getName());

    }

}
