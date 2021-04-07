package com.learn.observer.trafficSignal;

import java.awt.*;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.trafficSignal
 * @ClassName: Zhangsan
 * @Description:具体观察者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 22:15
 * @Version: V1.0
 */
public class Zhangsan implements IPerson{
    @Override
    public void across(Color color) {
        if(Color.green.equals(color)){
            System.out.println("绿灯了，可以通过！！！");
        }else {
            System.out.println("红灯禁止通行！！！");
        }
    }
}
