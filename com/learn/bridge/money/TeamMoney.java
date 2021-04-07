package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: TeamMoney
 * @Description:具体实现角色：团队奖
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:36
 * @Version: V1.0
 */
public class TeamMoney implements Money{
    @Override
    public String getMoneyType() {
        return "团队奖";
    }

    @Override
    public Double getMoneyAmount() {
        return 500000.00;
    }
}
