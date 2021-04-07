package com.learn.mediator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: ConcreteColleagueB
 * @Description:具体同事类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:20
 * @Version: V1.0
 */
public class ConcreteColleagueB extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类B收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类B发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
