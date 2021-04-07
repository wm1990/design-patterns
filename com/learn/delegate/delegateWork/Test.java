package com.learn.delegate.delegateWork;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.delegateWork
 * @ClassName: Test
 * @Description:
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 23:16
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command(new Leader(),"研发");
        boss.command(new Leader(),"销售");
    }
}
