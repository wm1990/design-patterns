package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: ILoginForThird
 * @Description:第三方登录接口
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:05
 * @Version: V1.0
 */
public interface ILoginForThird {
    ResultMsg loginForQQ(Object[] openId);

    ResultMsg loginForWechat(Object[] openId);

    ResultMsg loginForWeibo(Object[] openId);
}
