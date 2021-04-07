package com.learn.state.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.common
 * @ClassName: State
 * @Description:抽象状态
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 15:50
 * @Version: V1.0
 */
public abstract class State {
    abstract void Handle(Context context);
}
