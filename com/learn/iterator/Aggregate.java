package com.learn.iterator;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.iterator.common
 * @ClassName: Aggregate
 * @Description:抽象容器
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 22:35
 * @Version: V1.0
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
