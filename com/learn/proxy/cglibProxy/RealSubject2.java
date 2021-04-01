package com.learn.proxy.cglibProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.cglibProxy
 * @ClassName: RealSubject2
 * @Description:真实主体类2
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:12
 * @Version: V1.0
 */
public class RealSubject2 implements ISubject{
    @Override
    public void request() {
        System.out.println("处理另一套真实业务逻辑...");
    }
}
