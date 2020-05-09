package cn.dblearn.blog.portal.common.annotation;

import java.lang.annotation.*;

/**
 * ViewLog
 *
 * @author kb1s1024
 * @date 2019/02/15 14:51
 * @email kb1s1024@126.com
 * @description
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogLike {

     String type();
}
