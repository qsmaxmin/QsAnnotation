package com.qsmaxmin.annotation.presenter;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * @CreateBy qsmaxmin
 * @Date 2018/7/23 10:18
 * @Description bind presenter
 */
@Documented
@Target(TYPE)
@Retention(CLASS)
public @interface Presenter {
    Class value();
}
