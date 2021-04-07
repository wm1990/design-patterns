package com.learn.observer.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 21:59
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obsA = new ConcreteObserverA();
        Observer obsB = new ConcreteObserverB();
        subject.add(obsA);
        subject.add(obsB);
        subject.notifyObserver();
    }
}
