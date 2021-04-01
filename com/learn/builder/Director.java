package com.learn.builder;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.builder
 * @ClassName: Director
 * @Description:调用者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:59
 * @Version: V1.0
 */
public class Director {
    private AbstractBuilder computerBuilder;
    public Director(AbstractBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    //产品构建与组装方法
    public Computer construct() {
        computerBuilder.makeController();
        computerBuilder.makeOperator();
        computerBuilder.makeMemorizor();
        computerBuilder.makeInDevice();
        computerBuilder.makeOutDevice();
        return computerBuilder.getComputer();
    }
}
