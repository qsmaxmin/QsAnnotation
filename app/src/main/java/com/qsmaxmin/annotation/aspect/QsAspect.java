package com.qsmaxmin.annotation.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:11
 * @Description register custom aspect
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface QsAspect {
    /**
     * 设置AOP实现类
     */
    Class<? extends QsIAspect> value();

    /**
     * 自定义tag
     *
     * @see JoinPoint#getTag()
     */
    String tag() default "";
}