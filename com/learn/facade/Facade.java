package com.learn.facade;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.facade
 * @ClassName: Facade
 * @Description:门面类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:19
 * @Version: V1.0
 */
public class Facade {
    private SubModuleA subModuleA = new SubModuleA();
    private SubModuleB subModuleB = new SubModuleB();
    private SubModuleC subModuleC = new SubModuleC();

    public void doing() {
        subModuleA.doA();
        subModuleB.doB();
        subModuleC.doC();
    }
}
