package com.learn.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.Composite.transparent
 * @ClassName: CompositeDept
 * @Description:
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/30 23:01
 * @Version: V1.0
 * Copyright: 北京宏图天安 Copyright (c) 2021
 */
public class CompositeDept implements DeptComponent{
    private List<DeptComponent> children = new ArrayList<>();
    private String name;

    CompositeDept(String name){
        this.name = name;
    }

    @Override
    public void add(DeptComponent deptComponent) {
        children.add(deptComponent);
    }

    @Override
    public void remove(DeptComponent deptComponent) {
        children.remove(deptComponent);
    }

    @Override
    public List<DeptComponent> getChildren() {
        return children;
    }

    @Override
    public void getName() {
        System.out.println(name+"前来报到！");
    }
}
