package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: NiuNai
 * @Description:牛奶
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:01
 * @Version: V1.0
 */
public class NiuNai implements Milk{
    @Override
    public void make() {
        System.out.println("制作牛奶！！！");
    }
}
