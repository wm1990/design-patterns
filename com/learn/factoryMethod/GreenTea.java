package com.learn.factoryMethod;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.simpleFactory
 * @ClassName: GreenTea
 * @Description:绿茶
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 10:08
 * @Version: V1.0
 */
public class GreenTea implements Tea{
    @Override
    public void make() {
        System.out.println("制作绿茶！！！");
    }
}
