package com.learn.command.orderFood;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: ChickenCook
 * @Description:做红烧鱼的厨师
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:19
 * @Version: V1.0
 */
public class FishCook implements ICook{
    @Override
    public void action(){
        System.out.println("收到做红烧鱼的命令，开始做红烧鱼！");
    }
}
