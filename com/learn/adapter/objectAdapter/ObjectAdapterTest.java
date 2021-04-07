package com.learn.adapter.objectAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.objectAdapter
 * @ClassName: ObjectAdapterTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:53
 * @Version: V1.0
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
