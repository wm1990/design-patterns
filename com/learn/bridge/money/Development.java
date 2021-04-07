package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: Development
 * @Description:扩展抽象角色：研发部
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:37
 * @Version: V1.0
 */
public class Development extends Department{
    public Development(Money money) {
        super(money);
    }

    @Override
    public String situation() {
        return "研发部奖金类型："+money.getMoneyType()+",金额："+money.getMoneyAmount();
    }
}
