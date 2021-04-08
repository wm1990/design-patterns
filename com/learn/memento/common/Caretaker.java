package com.learn.memento.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.common
 * @ClassName: Caretaker
 * @Description:管理者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:00
 * @Version: V1.0
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
