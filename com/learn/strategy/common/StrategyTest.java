package com.learn.strategy.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.common
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 23:41
 * @Version: V1.0
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context contextA = new Context(new ConcreteStrategyA());
        contextA.strategyMethod();

        Context contextB = new Context(new ConcreteStrategyB());
        contextB.strategyMethod();
    }
}
