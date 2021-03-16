package com.qsmaxmin.annotation.bind;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2019/6/6 11:52
 * @Description bind onClick
 * @deprecated gradle 5.0以后将不再支持该注解
 * 推荐使用DataBinding
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface OnClick {
    int[] value();

    long clickInterval() default 500L;
}
