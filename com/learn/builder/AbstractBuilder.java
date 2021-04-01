package com.learn.builder;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.builder
 * @ClassName: AbstractBuilder
 * @Description:抽象建造者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:58
 * @Version: V1.0
 */
public abstract class AbstractBuilder {
    private Computer computer = new Computer();
    public abstract void makeInDevice();
    public abstract void makeController();
    public abstract void makeOperator();
    public abstract void makeMemorizor();
    public abstract void makeOutDevice();

    //返回产品对象
    public Computer getComputer() {
        return computer;
    }
}
