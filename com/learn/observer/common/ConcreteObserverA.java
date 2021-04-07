package com.learn.observer.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.common
 * @ClassName: ConcreteObserverA
 * @Description:具体观察者A
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 21:54
 * @Version: V1.0
 */
public class ConcreteObserverA implements Observer{
    @Override
    public void update() {
        System.out.println("具体观察者A更新自身状态！");
    }
}
