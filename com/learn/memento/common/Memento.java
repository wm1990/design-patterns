package com.learn.memento.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.common
 * @ClassName: Memento
 * @Description:备忘录
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 15:47
 * @Version: V1.0
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
