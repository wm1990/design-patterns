package com.learn.delegate.delegateWork;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.delegateWork
 * @ClassName: Boss
 * @Description:老板
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 23:15
 * @Version: V1.0
 */
public class Boss {
    public void command(Leader leader,String task){
        leader.work(task);
    }
}
