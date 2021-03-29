package com.learn.factoryMethod;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.factoryMethod
 * @ClassName: RedTeaFactory
 * @Description:红茶工厂
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 11:04
 * @Version: V1.0
 */
public class RedTeaFactory implements Factory{
    @Override
    public Tea create() {
        return new RedTea();
    }
}

