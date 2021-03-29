package com.learn.simpleFactory;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.simpleFactory
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 10:09
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Tea tea = SimpleFactory.makeTea(1);
        tea.show();
    }
}
