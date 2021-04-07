package com.learn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.iterator.common
 * @ClassName: ConcreteAggregate
 * @Description:具体容器
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 22:36
 * @Version: V1.0
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
