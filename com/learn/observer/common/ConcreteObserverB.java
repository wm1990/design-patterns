package com.learn.observer.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.common
 * @ClassName: ConcreteObserverB
 * @Description:具体观察者B
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 21:54
 * @Version: V1.0
 */
public class ConcreteObserverB implements Observer{
    @Override
    public void update() {
        System.out.println("具体观察者B更新自身状态！");
    }
}
