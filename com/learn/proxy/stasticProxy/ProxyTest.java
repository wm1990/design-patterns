package com.learn.proxy.stasticProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.stasticProxy
 * @ClassName: ProxyTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:07
 * @Version: V1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
