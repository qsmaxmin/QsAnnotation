package com.qsmaxmin.annotation.aspect;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:27
 * @Description
 */
public interface JoinPoint {
    /**
     * 执行原方法
     * 被注解的方法不会主动执行
     * 只有调用该方法，被注解的方法才会得到执行
     */
    Object proceed();

    /**
     * 获取持有该方法的对象主体
     *
     * @return 如果被QsAspect注解的方法是静态的，则返回null
     */
    Object getTarget();

    /**
     * 获取被注解的方法的参数
     */
    Object[] getArgs();

    /**
     * 获取自定义tag
     *
     * @see QsAspect#tag()
     */
    String getTag();
}
