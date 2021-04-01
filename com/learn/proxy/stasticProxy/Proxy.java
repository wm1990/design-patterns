package com.learn.proxy.stasticProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.stasticProxy
 * @ClassName: Proxy
 * @Description:代理类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:07
 * @Version: V1.0
 */
public class Proxy implements ISubject{
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    private void beforeRequest() {
        System.out.println("前置处理...");
    }

    private void afterRequest() {
        System.out.println("后置处理...");
    }
}
