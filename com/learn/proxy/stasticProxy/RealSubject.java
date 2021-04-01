package com.learn.proxy.stasticProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.stasticProxy
 * @ClassName: RealSubject
 * @Description:真实主体类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:06
 * @Version: V1.0
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("处理真实业务逻辑...");
    }
}
