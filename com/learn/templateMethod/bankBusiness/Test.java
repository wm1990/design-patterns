package com.learn.templateMethod.bankBusiness;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.templateMethod.bankBusiness
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 14:50
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractBusiness ta = new TransferAccounts();
        ta.doBusinessTemplate();

        AbstractBusiness sm = new SaveMoney();
        sm.doBusinessTemplate();
    }
}
