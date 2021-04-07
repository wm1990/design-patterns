package com.learn.command.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.common
 * @ClassName: Invoker
 * @Description:请求者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 14:54
 * @Version: V1.0
 */
public class Invoker {
    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者发布命令command...");
        command.command();
    }
}
