package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: Factory2
 * @Description:工厂2
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:03
 * @Version: V1.0
 */
public class Factory2 implements Factory{
    @Override
    public Tea create() {
        return new GreenTea();
    }

    @Override
    public Milk produce() {
        return new YangNai();
    }
}

