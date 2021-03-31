package com.learn.singleton;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: LazySingletonStaticInnerClass
 * @Description:使用静态内部类实现的单列模式
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:25
 * @Version: V1.0
 */
public class LazySingletonStaticInnerClass {
    private LazySingletonStaticInnerClass(){
        if(LazyHolder.instance != null){
            throw new RuntimeException("单例模式不允许创建多个实例");
        }
    }

    public static final LazySingletonStaticInnerClass getInstance(){
        //返回结果前，一定会先加载内部类
        return LazyHolder.instance;
    }

    private static class LazyHolder{
        private static final LazySingletonStaticInnerClass instance = new LazySingletonStaticInnerClass();
    }
}
