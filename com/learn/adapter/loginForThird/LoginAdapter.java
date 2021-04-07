package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: LoginAdapter
 * @Description:登录适配器接口
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:03
 * @Version: V1.0
 */
public interface LoginAdapter {
    boolean support(Object object);
    ResultMsg login(Object[] username,Object adapter);
}
