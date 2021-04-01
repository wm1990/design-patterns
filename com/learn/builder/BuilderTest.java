package com.learn.builder;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.builder
 * @ClassName: BuilderTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:59
 * @Version: V1.0
 */
public class BuilderTest {
    public static void main(String[] args) {
        AbstractBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director(computerBuilder);
        Computer computer = director.construct();
        computer.show();
    }
}
