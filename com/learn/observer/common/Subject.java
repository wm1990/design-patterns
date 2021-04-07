package com.learn.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.common
 * @ClassName: Subject
 * @Description:抽象主题
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 21:56
 * @Version: V1.0
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    //通知观察者方法
    abstract void notifyObserver();
}
