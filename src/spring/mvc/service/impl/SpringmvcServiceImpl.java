package spring.mvc.service.impl;

import spring.mvc.annotation.MyService;
import spring.mvc.service.SpringmvcService;

import java.util.Map;

/**
 * Created by wei.peng on 2018/8/20.
 */
@MyService("SpringmvcServiceImpl")
public class SpringmvcServiceImpl implements SpringmvcService {

    @Override
    public int insert(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "select");
        return 0;
    }


}
