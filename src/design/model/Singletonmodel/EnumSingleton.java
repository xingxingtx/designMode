package design.model.Singletonmodel;

/**
 * Created by Administrator on 2018/7/31.
 */
public enum  EnumSingleton {
    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    INSTANCE{
        @Override
        public void singletonOperation() {
            //功能处理
        }
    };
    /**
     * 单例可以有自己的操作
     */
    public abstract void singletonOperation();



}
