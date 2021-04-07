package com.learn.adapter.interfaceAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.interfaceAdapter
 * @ClassName: AdapterTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:56
 * @Version: V1.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request1();
        target.request2();
        target.request3();
        target.request4();
        target.request5();
    }
}
