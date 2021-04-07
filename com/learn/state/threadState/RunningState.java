package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: RunningState
 * @Description:运行状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:53
 * @Version: V1.0
 */
public class RunningState extends ThreadState{
    public RunningState() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }

    //阻塞
    public void suspend(ThreadContext hj) {
        System.out.print("调用suspend()方法-->");
        hj.setState(new BlockedState());
    }

    //结束
    public void stop(ThreadContext threadContext) {
        System.out.print("调用stop()方法-->");
        threadContext.setState(new DeadState());
    }
}
