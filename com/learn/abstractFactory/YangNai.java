package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: YangNai
 * @Description:羊奶
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:02
 * @Version: V1.0
 */
public class YangNai implements Milk{
    @Override
    public void make() {
        System.out.println("制作羊奶！！！");
    }
}
