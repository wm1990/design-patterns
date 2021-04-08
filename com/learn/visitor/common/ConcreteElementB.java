package com.learn.visitor.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: ConcreteElementB
 * @Description:具体元素
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 11:51
 * @Version: V1.0
 */
public class ConcreteElementB implements IElement{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "对元素B一顿操作！";
    }
}
