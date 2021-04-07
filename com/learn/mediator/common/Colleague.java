package com.learn.mediator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: Colleague
 * @Description:抽象同事类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:19
 * @Version: V1.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    //接收
    public abstract void receive();
    //发送
    public abstract void send();
}
