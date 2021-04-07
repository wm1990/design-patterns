package com.learn.mediator.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.mediator.common
 * @ClassName: ConcreteMediator
 * @Description:具体中介者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 14:23
 * @Version: V1.0
 */
public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague receiver : colleagues) {
            if (!receiver.equals(colleague)) {
                receiver.receive();
            }
        }
    }
}
