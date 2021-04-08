package com.learn.visitor.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.common
 * @ClassName: VisitorTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 12:00
 * @Version: V1.0
 */
public class VisitorTest {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        IVisitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("========================================");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
