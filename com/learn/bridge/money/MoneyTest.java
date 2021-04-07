package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: MoneyTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:38
 * @Version: V1.0
 * Copyright: 北京宏图天安 Copyright (c) 2021
 */
public class MoneyTest {
    public static void main(String[] args) {
        Money money = new PersonMoney();
        Department department = new Sales(money);
        System.out.println(department.situation());

        money = new TeamMoney();
        department = new Development(money);
        System.out.println(department.situation());
    }
}
