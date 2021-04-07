package com.learn.adapter.classAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.classAdapter
 * @ClassName: ClassAdapterTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:47
 * @Version: V1.0
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
