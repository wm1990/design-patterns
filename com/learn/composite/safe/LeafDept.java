package com.learn.composite.safe;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.Composite.transparent
 * @ClassName: Leaf
 * @Description:
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/30 22:55
 * @Version: V1.0
 */
public class LeafDept implements DeptComponent {
    private String name;

    public LeafDept(String name){
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name+"前来报到！");
    }
}
