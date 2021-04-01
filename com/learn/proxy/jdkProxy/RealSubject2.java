package com.learn.proxy.jdkProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.jdkProxy
 * @ClassName: RealSubject2
 * @Description:真实主体类2
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:09
 * @Version: V1.0
 */
public class RealSubject2 implements ISubject{
    @Override
    public void request() {
        System.out.println("处理另一套真实业务逻辑...");
    }
}
