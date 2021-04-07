package com.learn.state.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.common
 * @ClassName: Context
 * @Description:上下文
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 15:51
 * @Version: V1.0
 */
public class Context {
    private State state;

    //定义上下文的初始状态
    public Context(){
        this.state = new ConcreteStateB();
    }
    //设置新状态
    public void setState(State state) {
        this.state = state;
    }

    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}
