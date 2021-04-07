package com.learn.flyweight.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight
 * @ClassName: FlyweightTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:11
 * @Version: V1.0
 */
public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweightA1 = factory.getFlyweight("a");
        Flyweight flyweightA2 = factory.getFlyweight("a");
        Flyweight flyweightA3 = factory.getFlyweight("a");
        flyweightA1.operation("第1次调用a");
        flyweightA2.operation("第2次调用a");
        flyweightA3.operation("第3次调用a");
    }
}
