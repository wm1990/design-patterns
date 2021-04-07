package com.learn.bridge.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.common
 * @ClassName: Abstraction
 * @Description:抽象角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:28
 * @Version: V1.0
 */
public abstract class Abstraction {
    public Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    abstract void operation();
}
