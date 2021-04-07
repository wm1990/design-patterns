package com.learn.command.orderFood;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: Fish
 * @Description:红烧鱼
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:24
 * @Version: V1.0
 */
public class Fish implements IFood{
    private FishCook fishCook = new FishCook();

    @Override
    public void cooking() {
        fishCook.action();
    }
}
