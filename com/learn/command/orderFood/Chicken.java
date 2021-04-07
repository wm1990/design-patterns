package com.learn.command.orderFood;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: Fish
 * @Description:鸡翅
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:24
 * @Version: V1.0
 */
public class Chicken implements IFood{
    private ChickenCook chickenCook = new ChickenCook();

    @Override
    public void cooking() {
        chickenCook.action();
    }
}
