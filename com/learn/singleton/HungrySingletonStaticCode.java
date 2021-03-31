package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: HungrySingletonStaticCode
 * @Description:使用静态代码块实现单例
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:21
 * @Version: V1.0
 */
public class HungrySingletonStaticCode {
    private static final HungrySingletonStaticCode instance;

    static {
        instance = new HungrySingletonStaticCode();
    }

    private HungrySingletonStaticCode(){}

    public static HungrySingletonStaticCode getInstance(){
        return instance;
    }
}
