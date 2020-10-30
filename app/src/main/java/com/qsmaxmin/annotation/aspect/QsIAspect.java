package com.qsmaxmin.annotation.aspect;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:26
 * @Description 自定义aspect代码, 实现类必须保留一个空参的构造.
 */
public interface QsIAspect {
    /**
     * 被注解的方法被调用时, 首先会执行该方法.
     * 原方法体不会主动得到执行, 只有调用{@link JoinPoint#proceed()}原方法体才会得到执行.
     * 所以在JoinPoint.proceed()方法前后添加代码, 就能实现AOP编程.
     * 其中, JoinPoint.proceed()方法的返回值即原方法的返回值.
     */
    Object around(JoinPoint point);
}
