package com.learn.observer.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.common
 * @ClassName: ConcreteSubject
 * @Description:具体主题
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 21:57
 * @Version: V1.0
 */
public class ConcreteSubject extends Subject{
    @Override
    void notifyObserver() {
        System.out.println("被观察者发生改变...");
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
