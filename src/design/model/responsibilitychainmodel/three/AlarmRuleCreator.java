package design.model.responsibilitychainmodel.three;

/**
 * Created by Administrator on 2018/8/22.
 * 规则创建责任链
 */
public class AlarmRuleCreator {
    private AbstractRuleHandler alarmRuleHandler;
    public AlarmRuleCreator() {
        alarmRuleHandler = new ThresholdParseHandler();
        alarmRuleHandler.setNextHandler(new StreamGenerateHandler())
                .setNextHandler(new RulePesistHandler());
    }

    public void create(AlarmRule rule) {
        alarmRuleHandler.doHandle(rule);
    }
    public static void main(String[] args) {
        AlarmRule rule = new AlarmRule();
        rule.setThreshold("cpuRate < 10");
        rule.setName("Cpu Alarm");

        AlarmRuleCreator ruleCreator = new AlarmRuleCreator();
        ruleCreator.create(rule);
        System.out.println();

        rule.setName("");
        ruleCreator.create(rule);
    }

}
