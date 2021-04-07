package com.learn.templateMethod.bankBusiness;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.bankBusiness
 * @ClassName: TransferAccounts
 * @Description:转账
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:44
 * @Version: V1.0
 */
public class TransferAccounts extends AbstractBusiness{
    @Override
    protected void doBusiness() {
        System.out.println("我要转账！！！");
    }

    @Override
    protected void evaluate() {
        System.out.println("5星好评！！！");
    }
}
