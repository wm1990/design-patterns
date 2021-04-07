package com.learn.state.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.common
 * @ClassName: ConcreteStateA
 * @Description:具体状态B
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 15:55
 * @Version: V1.0
 */
public class ConcreteStateB extends State{
    @Override
    void Handle(Context context) {
        System.out.println("当前状态是 B.");
        System.out.println("转换为A。。。");
        context.setState(new ConcreteStateA());
    }
}
