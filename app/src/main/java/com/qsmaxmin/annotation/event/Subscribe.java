package com.qsmaxmin.annotation.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2019/10/31 13:36
 * @Description like event bus
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface Subscribe {
}
