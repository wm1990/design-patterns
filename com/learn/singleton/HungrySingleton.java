package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: HungrySingleton
 * @Description:饿汉式单例
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:19
 * @Version: V1.0
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
