package com.qsmaxmin.annotation.custom;

/**
 * @CreateBy qsmaxmin
 * @Date 2020/10/23 14:26
 * @Description 自定义aspect代码, 实现类必须保留一个空参的构造
 */
public interface QsIAspect {
    void around(JoinPoint point);
}
