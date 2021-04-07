package com.learn.composite.safe;

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
 */
public class CompositeDept implements DeptComponent{
    private List<DeptComponent> children = new ArrayList<>();
    private String name;

    CompositeDept(String name){
        this.name = name;
    }

    public void add(DeptComponent deptComponent) {
        children.add(deptComponent);
    }

    public void remove(DeptComponent deptComponent) {
        children.remove(deptComponent);
    }

    public List<DeptComponent> getChildren() {
        return children;
    }

    @Override
    public void getName() {
        System.out.println(name+"前来报到！");
    }
}
