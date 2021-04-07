package com.learn.templateMethod.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.common
 * @ClassName: AbstractClass
 * @Description:抽象模板
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:09
 * @Version: V1.0
 */
public abstract class AbstractClass {
    //模板方法
    public final void TemplateMethod() {
        SpecificMethod();
        if(needMethod1()){
            abstractMethod1();
        }
        abstractMethod2();
    }
    //具体方法
    protected void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    //抽象方法1
    protected abstract void abstractMethod1();
    //抽象方法2
    protected abstract void abstractMethod2();

    protected boolean needMethod1(){
        return true;
    }
}
