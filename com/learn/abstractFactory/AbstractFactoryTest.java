package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: AbstractFactoryTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:04
 * @Version: V1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory1();
        Tea tea = factory.create();
        Milk milk = factory.produce();
        tea.make();
        milk.make();
    }
}

