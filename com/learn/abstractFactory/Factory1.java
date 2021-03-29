package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: Factory1
 * @Description:工厂1
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:02
 * @Version: V1.0
 */
public class Factory1 implements Factory{
    @Override
    public Tea create() {
        return new RedTea();
    }

    @Override
    public Milk produce() {
        return new NiuNai();
    }
}
