package com.learn.visitor.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: IElement
 * @Description:抽象元素
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 11:49
 * @Version: V1.0
 */
public interface IElement {
    void accept(IVisitor visitor);
}
