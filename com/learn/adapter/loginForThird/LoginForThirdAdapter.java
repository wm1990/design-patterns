package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: LoginForThirdAdapter
 * @Description:第三方登录实现类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:06
 * @Version: V1.0
 */
public class LoginForThirdAdapter implements ILoginForThird{
    @Override
    public ResultMsg loginForQQ(Object[] openId) { return loginForThird(openId,new LoginForQQAdapter()); }

    @Override
    public ResultMsg loginForWechat(Object[] openId) {
        return loginForThird(openId,new LoginForWeChatAdapter());
    }

    @Override
    public ResultMsg loginForWeibo(Object[] openId) {
        return loginForThird(openId,new LoginForWeiboChatAdapter());
    }

    private ResultMsg loginForThird(Object[] openId,LoginAdapter adapter){
        if(adapter.support(adapter)){
            return adapter.login(openId,adapter);
        }
        return null;
    }
}
