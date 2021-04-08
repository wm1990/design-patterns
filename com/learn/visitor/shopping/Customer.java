package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Customer
 * @Description:顾客（访问者）
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:30
 * @Version: V1.0
 */
public class Customer implements IVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("苹果：单价是"+apple.getPrice()+",特点是"+apple.getCost());
    }

    @Override
    public void visit(Banana banana) {
        System.out.println("香蕉：单价是"+banana.getPrice()+",特点是"+banana.getCost());
    }
}
