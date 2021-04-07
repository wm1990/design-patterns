package com.learn.decorator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator
 * @ClassName: DecoratorTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:29
 * @Version: V1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.doingSomeThing();

        Component decorator = new ConcreteDecorator(component);
        decorator.doingSomeThing();
    }
}
