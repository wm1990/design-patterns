package com.learn.builder;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.builder
 * @ClassName: ComputerBuilder
 * @Description:具体建造者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:58
 * @Version: V1.0
 */
public class ComputerBuilder extends AbstractBuilder{
    @Override
    public void makeInDevice() {
        System.out.println("连接输入设备！");
    }

    @Override
    public void makeController() {
        System.out.println("组装控制器！");
    }

    @Override
    public void makeOperator() {
        System.out.println("组装运算器！");
    }

    @Override
    public void makeMemorizor() {
        System.out.println("组装存储设备！");
    }

    @Override
    public void makeOutDevice() {
        System.out.println("连接输出设备！");
    }
}
