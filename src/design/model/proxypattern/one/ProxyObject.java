package design.model.proxypattern.one;

/**
 * Created by wei.peng on 2018/8/21.
 * 代理角色对象
 */
public class ProxyObject implements AbsProxy{
    TargetObject targetObject = null;
    public ProxyObject(TargetObject targetObject){
        this.targetObject = targetObject;
    }
    @Override
    public void add() {
        targetObject.add();
        System.out.println("代理角色对象add");
    }

    @Override
    public void delete() {
        targetObject.delete();
        System.out.println("代理角色对象delete");
    }

    @Override
    public void update() {
        targetObject.update();
        System.out.println("代理角色对象update");
    }

    @Override
    public void query() {
        targetObject.query();
        System.out.println("代理角色对象query");
    }

}
