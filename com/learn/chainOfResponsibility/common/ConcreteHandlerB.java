package com.learn.chainOfResponsibility.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.common
 * @ClassName: ConcreteHandlerB
 * @Description:具体处理者B
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 22:47
 * @Version: V1.0
 */
public class ConcreteHandlerB extends Handler{
    @Override
    void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("具体处理者A处理该请求！");
        } else {
            System.out.println("请求未处理！");
        }
    }
}
