package com.learn.command.orderFood;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: Fish
 * @Description:面条
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:24
 * @Version: V1.0
 */
public class Noodle implements IFood{
    private NoodleCook noodleCook = new NoodleCook();

    @Override
    public void cooking() {
        noodleCook.action();
    }
}
