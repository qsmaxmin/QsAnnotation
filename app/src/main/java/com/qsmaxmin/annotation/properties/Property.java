package com.qsmaxmin.annotation.properties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2019/10/31 13:36
 * @Description Properties
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface Property {
    String value() default "";
}
