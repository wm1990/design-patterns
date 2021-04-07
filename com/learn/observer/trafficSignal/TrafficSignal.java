package com.learn.observer.trafficSignal;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.trafficSignal
 * @ClassName: TrafficSignal
 * @Description:具体主题
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 22:21
 * @Version: V1.0
 */
public class TrafficSignal extends AbstractTrafficSignal{
    //信号灯改变
    @Override
    public void change(Color color) {
        for (IPerson observer : personList) {
            observer.across(color);
        }
    }
}
