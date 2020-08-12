package com.qsmaxmin.annotation.thread;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2017/6/20 16:40
 * @Description thread join
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface ThreadPoint {
    ThreadType value();
}
