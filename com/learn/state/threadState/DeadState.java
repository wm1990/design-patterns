package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: DeadState
 * @Description:死亡状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 17:02
 * @Version: V1.0
 */
public class DeadState extends ThreadState{
    public DeadState() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
