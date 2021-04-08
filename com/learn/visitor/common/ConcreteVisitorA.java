package com.learn.visitor.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: ConcreteVisitorA
 * @Description:具体访问者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 11:53
 * @Version: V1.0
 */
public class ConcreteVisitorA implements IVisitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问-->" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问-->" + concreteElementB.operationB());
    }
}
