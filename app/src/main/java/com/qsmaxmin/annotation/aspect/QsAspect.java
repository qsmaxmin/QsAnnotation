package com.qsmaxmin.annotation.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:11
 * @Description enable aspect
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface QsAspect {
    Class<? extends QsIAspect> value();
}