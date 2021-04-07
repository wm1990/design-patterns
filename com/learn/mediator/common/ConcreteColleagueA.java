package com.learn.mediator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: ConcreteColleagueA
 * @Description:具体同事类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:20
 * @Version: V1.0
 */
public class ConcreteColleagueA extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类A收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类A发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
