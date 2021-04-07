package com.learn.command.orderFood;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:31
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        IFood chicken = new Chicken();
        IFood fish = new Fish();
        IFood noodle = new Noodle();

        waiter.AddCook(chicken);
        waiter.AddCook(fish);
        waiter.AddCook(noodle);

        waiter.command(fish);
        System.out.println("=================================");
        waiter.commands();
    }
}
