package com.learn.facade;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.facade
 * @ClassName: FacadeTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:20
 * @Version: V1.0
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doing();
    }
}
