package com.learn.delegate.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.common
 * @ClassName: ConcreteA
 * @Description:具体任务角色A
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 22:48
 * @Version: V1.0
 */
public class ConcreteA implements Task{
    @Override
    public void doTask() {
        System.out.println("负责工作A！");
    }
}
