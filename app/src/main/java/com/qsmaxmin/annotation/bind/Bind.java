package com.qsmaxmin.annotation.bind;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2019/6/6 14:40
 * @Description bind view
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface Bind {
    int value();
}
