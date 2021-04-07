package com.learn.adapter.loginForThird;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.loginForThird
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:07
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        LoginForThirdAdapter adapter = new LoginForThirdAdapter();
        ResultMsg resultMsg = adapter.loginForQQ(new Object[]{"96e79218965eb72c92a549dd5a330112"});
        System.out.println(resultMsg.getMsg());
    }
}
