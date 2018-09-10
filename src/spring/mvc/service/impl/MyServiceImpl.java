package spring.mvc.service.impl;

import spring.mvc.annotation.MyQuatifier;
import spring.mvc.annotation.MyService;
import spring.mvc.service.Service;


import java.util.Map;

/**
 * Created by wei.peng on 2018/8/20.
 */
@MyService("MyServiceImpl")
public class MyServiceImpl implements Service {
    @Override
    public int insert(Map map) {
        System.out.println("MyServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("MyServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("MyServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("MyServiceImpl:" + "select");
        return 0;
    }

}
