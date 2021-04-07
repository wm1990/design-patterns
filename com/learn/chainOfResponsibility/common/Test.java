package com.learn.chainOfResponsibility.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 22:54
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.next(handlerB);

        handlerA.handleRequest("A");
    }
}
