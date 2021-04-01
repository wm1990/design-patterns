package com.learn.proxy.jdkProxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.jdkProxy
 * @ClassName: ProxyTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:10
 * @Version: V1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();

        RealSubject1 realSubject1 = new RealSubject1();
        ISubject proxy = jdkProxy.getInstance(realSubject1);
        proxy.request();
        System.out.println("---------------------分割线---------------------------");
        RealSubject2 realSubject2 = new RealSubject2();
        ISubject proxy2 = jdkProxy.getInstance(realSubject2);
        proxy2.request();
    }
}
