package com.learn.memento.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.common
 * @ClassName: MementoTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:02
 * @Version: V1.0
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态:" + originator.getState());
        //备份状态
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);
        originator.setState("S1");
        System.out.println("新的状态:" + originator.getState());
        //恢复状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复状态:" + originator.getState());
    }
}
