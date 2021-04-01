package com.learn.proxy.cglibProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.cglibProxy
 * @ClassName: ProxyTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:15
 * @Version: V1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        RealSubject1 realSubject1 = new RealSubject1();
        ISubject proxy = cglibProxy.getInstance(realSubject1.getClass());
        proxy.request();
        System.out.println("---------------------分割线---------------------------");
        RealSubject2 realSubject2 = new RealSubject2();
        ISubject proxy2 = cglibProxy.getInstance(realSubject2.getClass());
        proxy2.request();
    }
}
