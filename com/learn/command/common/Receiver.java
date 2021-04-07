package com.learn.command.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.common
 * @ClassName: Receiver
 * @Description:命令接受者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 14:50
 * @Version: V1.0
 */
public class Receiver {
    public void action(){
        System.out.println("命令接收者接到命令，开始执行...");
    }
}
