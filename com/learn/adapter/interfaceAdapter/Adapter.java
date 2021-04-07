package com.learn.adapter.interfaceAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.interfaceAdapter
 * @ClassName: Adapter
 * @Description:适配器类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:56
 * @Version: V1.0
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request1() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换成目标对象1");
    }

    @Override
    public void request2() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换成目标对象2");
    }

    @Override
    public void request3() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换成目标对象3");
    }

    @Override
    public void request4() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换成目标对象4");
    }

    @Override
    public void request5() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换成目标对象5");
    }
}
