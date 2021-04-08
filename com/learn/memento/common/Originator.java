package com.learn.memento.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.common
 * @ClassName: Originator
 * @Description:发起人
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:00
 * @Version: V1.0
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
