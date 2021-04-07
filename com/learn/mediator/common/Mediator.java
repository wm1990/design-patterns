package com.learn.mediator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: Mediator
 * @Description:抽象中介者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:17
 * @Version: V1.0
 */
public abstract class Mediator {
    //注册
    public abstract void register(Colleague colleague);
    //转发
    public abstract void relay(Colleague colleague);
}
