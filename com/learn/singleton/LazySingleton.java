package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: LazySingleton
 * @Description:懒汉式单例
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:23
 * @Version: V1.0
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
