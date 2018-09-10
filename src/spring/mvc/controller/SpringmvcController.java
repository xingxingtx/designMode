package spring.mvc.controller;


import spring.mvc.annotation.MyController;
import spring.mvc.annotation.MyQuatifier;
import spring.mvc.annotation.MyRequestMapping;
import spring.mvc.service.Service;
import spring.mvc.service.impl.SpringmvcServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wei.peng on 2018/8/20.
 */
@MyController()
public class SpringmvcController {
    @MyQuatifier("MyServiceImpl")
    Service myService;
    @MyQuatifier ("SpringmvcServiceImpl")
    SpringmvcServiceImpl smService;

    @MyRequestMapping("/insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        smService.insert(null);
        return null;
    }

    @MyRequestMapping("/delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        smService.delete(null);
        return null;
    }

    @MyRequestMapping("/update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        smService.update(null);
        return null;
    }

    @MyRequestMapping("/select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        smService.select(null);
        return null;
    }

}
