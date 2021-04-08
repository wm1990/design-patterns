package com.learn.visitor.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: Visitor
 * @Description:抽象访问者
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 11:52
 * @Version: V1.0
 */
public interface IVisitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
