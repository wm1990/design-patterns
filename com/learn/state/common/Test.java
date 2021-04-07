package com.learn.state.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:03
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.Handle();
        context.Handle();
    }
}
