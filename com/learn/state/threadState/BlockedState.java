package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: BlockedState
 * @Description:阻塞状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:58
 * @Version: V1.0
 */
public class BlockedState extends ThreadState{
    public BlockedState() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }

    //唤醒
    public void resume(ThreadContext threadContext) {
        System.out.print("调用resume()方法-->");
        threadContext.setState(new RunnableState());
    }
}
