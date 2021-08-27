package com.qsmaxmin.annotation.route;

import java.util.HashMap;

/**
 * @CreateBy qsmaxmin
 * @Date 2021/8/27 11:44
 * @Description
 */
public interface QsIRoute {
    void bindRouteByQsPlugin(HashMap<String, Class<?>> map);
}
