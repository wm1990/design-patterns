package com.learn.command.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 14:55
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        System.out.println("客户端访问调用者的call()方法...");
        invoker.call();
    }
}
