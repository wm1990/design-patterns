package com.learn.chainOfResponsibility.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.common
 * @ClassName: ConcreteHandlerA
 * @Description:具体处理者A
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 22:47
 * @Version: V1.0
 */
public class ConcreteHandlerA extends Handler{
    @Override
    void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("具体处理者A处理该请求！");
        } else {
            next.handleRequest(request);
        }
    }
}
