package com.learn.templateMethod.bankBusiness;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.bankBusiness
 * @ClassName: SaveMoney
 * @Description:存钱
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:48
 * @Version: V1.0
 */
public class SaveMoney extends AbstractBusiness{
    @Override
    protected void doBusiness() {
        System.out.println("我要存钱！！！");
    }

    @Override
    protected void evaluate() {
        System.out.println("4星好评！！！");
    }
}
