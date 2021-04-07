package com.learn.decorator.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator
 * @ClassName: ConcreteComponent
 * @Description:具体构件
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:27
 * @Version: V1.0
 */
public class ConcreteComponent implements Component{
    @Override
    public void doingSomeThing() {
        System.out.println("调用具体构件做些事情！！！");
    }
}
