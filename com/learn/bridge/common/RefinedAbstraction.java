package com.learn.bridge.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.common
 * @ClassName: RefinedAbstraction
 * @Description:扩展抽象角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:28
 * @Version: V1.0
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        implementor.doSomeThing();
        System.out.println("扩展抽象角色扩展实现角色的方法");

    }
}
