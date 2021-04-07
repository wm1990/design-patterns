package com.learn.mediator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: MediatorTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:27
 * @Version: V1.0
 */
public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        mediator.register(colleagueA);
        mediator.register(colleagueB);

        colleagueA.send();
        System.out.println("==================================");
        colleagueB.send();
    }
}
