package com.learn.chainOfResponsibility.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.common
 * @ClassName: Handler
 * @Description:抽象处理者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 22:45
 * @Version: V1.0
 */
public abstract class Handler {
    protected Handler next;

    public void next(Handler handler){
        this.next = handler;
    }

    abstract void handleRequest(String request);
}
