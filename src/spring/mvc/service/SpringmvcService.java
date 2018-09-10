package spring.mvc.service;

import java.util.Map;

/**
 * Created by wei.peng on 2018/8/20.
 */
public interface SpringmvcService {
    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);

}
