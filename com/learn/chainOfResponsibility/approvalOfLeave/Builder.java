package com.learn.chainOfResponsibility.approvalOfLeave;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.approvalOfLeave
 * @ClassName: Builder
 * @Description:责任链建造者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 23:32
 * @Version: V1.0
 */
public class Builder {
    private LeaderHandler head;
    private LeaderHandler tail;

    public Builder addHandler(LeaderHandler leaderHandler){
        if(this.head == null){
            this.head = leaderHandler;
            this.tail = leaderHandler;
            return this;
        }
        this.tail.next(leaderHandler);
        this.tail = leaderHandler;
        return this;
    }

    public LeaderHandler build(){
        return this.head;
    }
}
