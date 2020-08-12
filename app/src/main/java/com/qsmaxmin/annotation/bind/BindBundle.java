package com.qsmaxmin.annotation.bind;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2019/6/6 11:52
 * @Description bind bundle
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface BindBundle {
    String value();
}
