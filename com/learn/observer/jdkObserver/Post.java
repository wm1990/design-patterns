package com.learn.observer.jdkObserver;

import java.util.Observable;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.jdkObserver
 * @ClassName: Post
 * @Description:贴吧发言
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 22:43
 * @Version: V1.0
 */
public class Post extends Observable {
    public void setNote(String note) {
        System.out.println("贴吧发言：");
        setChanged();
        notifyObservers(note);
    }
}
