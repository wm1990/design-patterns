package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: AbstractAdapter
 * @Description:抽象登录适配器，实现公共登录方法
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:04
 * @Version: V1.0
 */
public abstract class AbstractAdapter extends LoginService implements LoginAdapter{
    public ResultMsg login(Object[] id, Object adapter) {
        if(support(adapter)){
            return super.login(id.toString(), null);
        }
        return new ResultMsg(1111,"未支持的登录方式！！！");
    }
}
