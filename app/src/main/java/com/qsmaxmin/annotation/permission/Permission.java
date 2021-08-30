package com.qsmaxmin.annotation.permission;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2017/7/3 10:07
 * @Description permission
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Permission {
    String[] value() default {};

    boolean forceGoOn() default false;

    boolean showToastWhenReject() default false;
}
