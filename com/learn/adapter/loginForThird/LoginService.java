package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: LoginService
 * @Description:原有登录方法
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:03
 * @Version: V1.0
 */
public class LoginService {
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登录成功~");
    }
}
