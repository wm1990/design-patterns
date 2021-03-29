package com.learn.abstractFactory;

/**
 * @ProjectName: [lh-tms1.0]
 * @Package: com.timesoft.constant
 * @ClassName: Factory
 * @Description:工厂接口
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/27 22:02
 * @Version: V1.0
 */
public interface Factory {
    Tea create();

    Milk produce();
}
