package spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * Created by wei.peng on 2018/8/20.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();
}
