package com.learn.factoryMethod;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.factoryMethod
 * @ClassName: GreenTeaFactory
 * @Description:绿茶工厂
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 11:05
 * @Version: V1.0
 */
public class GreenTeaFactory implements Factory{
    @Override
    public Tea create() {
        return new GreenTea();
    }
}
