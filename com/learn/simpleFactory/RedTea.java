package com.learn.simpleFactory;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.simpleFactory
 * @ClassName: RedTea
 * @Description:红茶
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 10:06
 * @Version: V1.0
 */
public class RedTea implements Tea{
    @Override
    public void show() {
        System.out.println("制作红茶！！！");
    }
}

