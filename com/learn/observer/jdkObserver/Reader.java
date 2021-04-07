package com.learn.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.jdkObserver
 * @ClassName: Reader
 * @Description:观察者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 23:07
 * @Version: V1.0
 */
public class Reader implements Observer{
    private String name;

    public Reader(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String note = (String) arg;
        System.out.println("===============================");
        System.out.println(name+"，您好，收到一条新的发言，内容："+note);
    }
}
