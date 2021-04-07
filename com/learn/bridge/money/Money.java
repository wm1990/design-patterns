package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: Money
 * @Description:实现角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:35
 * @Version: V1.0
 */
public interface Money {
    //奖金类型
    String getMoneyType();
    //金额
    Double getMoneyAmount();
}
