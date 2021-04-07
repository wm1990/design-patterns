package com.learn.templateMethod.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.common
 * @ClassName: ConcreteClass
 * @Description:具体模板
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:18
 * @Version: V1.0
 */
public class ConcreteClass extends AbstractClass{
    private boolean needMethod1;

    public ConcreteClass(boolean needMethod1){
        this.needMethod1 = needMethod1;
    }

    @Override
    protected void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    protected boolean needMethod1() {
        return needMethod1;
    }
}
