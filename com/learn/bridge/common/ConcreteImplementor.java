package com.learn.bridge.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.common
 * @ClassName: ConcreteImplementor
 * @Description:具体实现角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:27
 * @Version: V1.0
 */
public class ConcreteImplementor implements Implementor{
    @Override
    public void doSomeThing() {
        System.out.println("具体实现角色要做事了");
    }
}
