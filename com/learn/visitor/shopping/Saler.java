package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Saler
 * @Description:商家（访问者）
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:34
 * @Version: V1.0
 */
public class Saler implements IVisitor{
    @Override
    public void visit(Apple apple) {
        System.out.println("苹果：单价是"+apple.getPrice()+",数量是"+apple.getAmount());
    }

    @Override
    public void visit(Banana banana) {
        System.out.println("香蕉：单价是"+banana.getPrice()+",数量是"+banana.getAmount());
    }
}
