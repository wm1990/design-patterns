package com.learn.templateMethod.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.common
 * @ClassName: TemplateMethodTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:21
 * @Version: V1.0
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass(false);
        tm.TemplateMethod();
    }
}
