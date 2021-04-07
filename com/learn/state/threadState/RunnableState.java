package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: RunnableState
 * @Description:就绪状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:52
 * @Version: V1.0
 */
public class RunnableState extends ThreadState{
    public RunnableState() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态.");
    }

    //获取CPU
    public void getCPU(ThreadContext threadContext) {
        System.out.print("获得CPU-->");
        threadContext.setState(new RunningState());
    }
}
