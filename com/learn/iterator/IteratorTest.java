package com.learn.iterator;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.iterator.common
 * @ClassName: IteratorTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 22:52
 * @Version: V1.0
 */
public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("秦朝");
        aggregate.add("汉朝");
        aggregate.add("隋朝");
        aggregate.add("唐朝");
        System.out.print("聚合的内容有：");
        Iterator it = aggregate.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "，");
        }
        Object ob = it.first();
        System.out.println("First：" + ob.toString());
    }
}
