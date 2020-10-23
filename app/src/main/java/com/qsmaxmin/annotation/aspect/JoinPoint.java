package com.qsmaxmin.annotation.aspect;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:27
 * @Description
 */
public interface JoinPoint {
    /**
     * 执行原方法
     */
    void proceed();

    /**
     * 获取持有该方法的对象主体
     */
    Object getTarget();
}
