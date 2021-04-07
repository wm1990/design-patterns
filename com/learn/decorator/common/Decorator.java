package com.learn.decorator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator
 * @ClassName: Decorator
 * @Description:抽象装饰类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:28
 * @Version: V1.0
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void doingSomeThing() {
        component.doingSomeThing();
    }
}
