package com.learn.visitor.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: ObjectStructure
 * @Description:对象结构
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 11:58
 * @Version: V1.0
 * Copyright: 北京宏图天安 Copyright (c) 2021
 */
public class ObjectStructure {
    private List<IElement> list = new ArrayList<>();

    public void accept(IVisitor visitor) {
        Iterator<IElement> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(IElement element) {
        list.add(element);
    }
    public void remove(IElement element) {
        list.remove(element);
    }
}
