package com.learn.delegate.delegateWork;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.delegateWork
 * @ClassName: ZhangSan
 * @Description:员工张三
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 23:05
 * @Version: V1.0
 */
public class ZhangSan implements IEmployee{
    @Override
    public void work(String task) {
        System.out.println("我是"+task+"，我擅长写软件");
    }
}
