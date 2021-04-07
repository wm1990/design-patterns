package com.learn.composite.safe;

import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.Composite.transparent
 * @ClassName: CompositeTest
 * @Description:
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/30 23:07
 * @Version: V1.0
 */
public class CompositeTest {
    public static void main(String[] args) {
        CompositeDept company = new CompositeDept("某公司");
        CompositeDept saleDept = new CompositeDept("销售部");
        CompositeDept developmentDept = new CompositeDept("研发部");
        CompositeDept financeDept = new CompositeDept("财务部");

        DeptComponent saleA = new LeafDept("销售部A组");
        DeptComponent saleB = new LeafDept("销售部B组");
        DeptComponent developmentA = new LeafDept("研发部A组");
        DeptComponent developmentB = new LeafDept("研发部B组");

        developmentDept.add(developmentA);
        developmentDept.add(developmentB);
        saleDept.add(saleA);
        saleDept.add(saleB);

        company.add(saleDept);
        company.add(developmentDept);
        company.add(financeDept);

        List<DeptComponent> children = company.getChildren();
        children.stream().forEach(deptComponent -> {
            deptComponent.getName();
            if(deptComponent instanceof CompositeDept){
                CompositeDept compositeDept = (CompositeDept) deptComponent;
                compositeDept.getChildren().stream().forEach(deptComponent1 -> deptComponent1.getName());
            }
        });
    }
}
