package com.learn.bridge.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.common
 * @ClassName: BridgeTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:29
 * @Version: V1.0
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}
