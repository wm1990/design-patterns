package com.learn.strategy.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.common
 * @ClassName: Context
 * @Description:上下文环境类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 23:39
 * @Version: V1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
