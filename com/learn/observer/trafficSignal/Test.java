package com.learn.observer.trafficSignal;

import java.awt.*;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.trafficSignal
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 22:25
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractTrafficSignal trafficSignal = new TrafficSignal();
        IPerson zhangsan = new Zhangsan();
        IPerson lisi = new Lisi();
        trafficSignal.add(zhangsan);
        trafficSignal.add(lisi);
        trafficSignal.change(Color.RED);
        trafficSignal.change(Color.GREEN);
    }
}
