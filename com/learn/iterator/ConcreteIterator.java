package com.learn.iterator;

import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.iterator.common
 * @ClassName: ConcreteIterator
 * @Description:具体迭代器
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 22:39
 * @Version: V1.0
 */
public class ConcreteIterator implements Iterator{
    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);;
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
