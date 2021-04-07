package com.learn.delegate.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.common
 * @ClassName: Delegate
 * @Description:委派者角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 22:50
 * @Version: V1.0
 */
public class Delegate implements Task{
    private String command;

    public Delegate(String command){
        this.command = command;
    }

    @Override
    public void doTask() {
        if("A".equals(command)){
            new ConcreteA().doTask();
        }else if("B".equals(command)){
            new ConcreteB().doTask();
        }else{
            System.out.println("无人能做该任务！！！");
        }
    }
}
