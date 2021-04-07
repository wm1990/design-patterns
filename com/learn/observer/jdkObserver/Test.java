package com.learn.observer.jdkObserver;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.observer.jdkObserver
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 23:10
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Post post = new Post();
        Reader zhangsan = new Reader("zhangsan");
        Reader lisi = new Reader("lisi");

        post.addObserver(zhangsan);
        post.addObserver(lisi);

        post.setNote("大家好，我是新来的吧友小明。");
    }
}
