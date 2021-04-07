package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: Sales
 * @Description:扩展抽象角色：销售部
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:37
 * @Version: V1.0
 */
public class Sales extends Department{
    public Sales(Money money) {
        super(money);
    }

    @Override
    public String situation() {
        return "销售部奖金类型："+money.getMoneyType()+",金额："+money.getMoneyAmount();
    }
}
