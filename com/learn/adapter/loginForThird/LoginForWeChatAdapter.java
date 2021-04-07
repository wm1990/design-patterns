package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: LoginForWeChatAdapter
 * @Description:微信登录适配器，实现校验逻辑
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:05
 * @Version: V1.0
 */
public class LoginForWeChatAdapter extends AbstractAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }
}
