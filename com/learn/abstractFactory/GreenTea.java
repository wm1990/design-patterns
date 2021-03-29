package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: GreenTea
 * @Description:绿茶
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 21:46
 * @Version: V1.0
 */
public class GreenTea implements Tea{
    @Override
    public void make() {
        System.out.println("制作绿茶！！！");
    }
}
