package com.learn.strategy.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.common
 * @ClassName: ConcreteStrategyA
 * @Description:具体策略B
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 23:37
 * @Version: V1.0
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("执行具体策略B的策略方法！");
    }
}
