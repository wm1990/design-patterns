package com.learn.chainOfResponsibility.approvalOfLeave;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.approvalOfLeave
 * @ClassName: Leader
 * @Description:抽象领导接口
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 23:07
 * @Version: V1.0
 */
public abstract class LeaderHandler {
    protected LeaderHandler chain;

    public void next(LeaderHandler leaderHandler){
        this.chain = leaderHandler;
    }

    abstract void approve(int leaveDays);
}
