package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: PersonMoney
 * @Description:具体实现角色：个人奖
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:36
 * @Version: V1.0
 */
public class PersonMoney implements Money{
    @Override
    public String getMoneyType() {
        return "个人奖";
    }

    @Override
    public Double getMoneyAmount() {
        return 10000.00;
    }
}
