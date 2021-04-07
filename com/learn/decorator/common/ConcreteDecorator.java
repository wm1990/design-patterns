package com.learn.decorator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator
 * @ClassName: ConcreteDecorator
 * @Description:具体装饰类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:28
 * @Version: V1.0
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doingSomeThing() {
        super.doingSomeThing();
        addExtend();
    }

    private void addExtend() {
        System.out.println("使用具体装饰器增加扩展功能！！！");
    }
}
