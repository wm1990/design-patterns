package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: LazySingletonDoubleCheck
 * @Description:使用双重检查锁的单例模式
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:23
 * @Version: V1.0
 */
public class LazySingletonDoubleCheck {
    private static volatile LazySingletonDoubleCheck instance = null;

    private LazySingletonDoubleCheck(){}

    public static LazySingletonDoubleCheck getInstance(){
        if(instance == null){
            synchronized(LazySingletonDoubleCheck.class){
                if(instance == null){
                    instance = new LazySingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
