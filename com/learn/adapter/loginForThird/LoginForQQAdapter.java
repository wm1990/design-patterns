package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: LoginForQQAdapter
 * @Description:QQ登录适配器，实现校验逻辑
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:04
 * @Version: V1.0
 */
public class LoginForQQAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }
}
