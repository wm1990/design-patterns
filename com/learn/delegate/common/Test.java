package com.learn.delegate.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 22:55
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Delegate delegate = new Delegate("A");
        delegate.doTask();
    }
}
