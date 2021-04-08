package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: IVisitor
 * @Description:访问者接口
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:23
 * @Version: V1.0
 */
public interface IVisitor {
    void visit(Apple apple);

    void visit(Banana banana);
}
