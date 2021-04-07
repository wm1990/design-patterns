package com.learn.command.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.common
 * @ClassName: ConcreteCommand
 * @Description:具体命令
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 14:52
 * @Version: V1.0
 */
public class ConcreteCommand implements ICommand{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void command() {
        receiver.action();
    }
}
