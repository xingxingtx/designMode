package spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * Created by wei.peng on 2018/8/20.
 */
@Target({ ElementType.METHOD  })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface  MyRequestMapping {
    String value() default "";
}
