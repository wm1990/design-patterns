package com.learn.bridge.money;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.bridge.money
 * @ClassName: Department
 * @Description:抽象角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 11:37
 * @Version: V1.0
 */
public abstract class Department {
    protected Money money;

    public Department(Money money){
        this.money = money;
    }

    //部门获奖情况
    public abstract String situation();
}
