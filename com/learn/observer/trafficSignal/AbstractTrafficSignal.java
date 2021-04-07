package com.learn.observer.trafficSignal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.trafficSignal
 * @ClassName: TrafficSignal
 * @Description:抽象主题
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 22:21
 * @Version: V1.0
 */
public abstract class AbstractTrafficSignal {
    List<IPerson> personList = new ArrayList<>();

    //增加观察者方法
    public void add(IPerson person) {
        personList.add(person);
    }

    //删除观察者方法
    public void remove(IPerson person) {
        personList.remove(person);
    }

    //信号灯改变
    public abstract void change(Color color);
}
