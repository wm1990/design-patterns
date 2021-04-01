package com.learn.proxy.jdkProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.jdkProxy
 * @ClassName: RealSubject1
 * @Description:真实主体类1
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:08
 * @Version: V1.0
 */
public class RealSubject1 implements ISubject{
    @Override
    public void request() {
        System.out.println("处理真实业务逻辑...");
    }
}
