package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: NewState
 * @Description:新建状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 16:46
 * @Version: V1.0
 */
public class NewState extends ThreadState{
    public NewState() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    //启动
    public void start(ThreadContext threadContext) {
        System.out.print("调用start()方法-->");
        threadContext.setState(new RunnableState());
    }
}
