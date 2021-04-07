package com.learn.iterator;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.iterator.common
 * @ClassName: Iterator
 * @Description:抽象迭代器
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 22:38
 * @Version: V1.0
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
