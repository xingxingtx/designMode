package spring.mvc.annotation;

import java.lang.annotation.*;

/**
 * Created by wei.peng on 2018/8/20.
 */

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyQuatifier {
    String value() default "";
}
