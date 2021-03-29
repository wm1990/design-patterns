package com.learn.factoryMethod;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.factoryMethod
 * @ClassName: FactoryMethodTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 11:06
 * @Version: V1.0
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory redTeaFactory = new RedTeaFactory();
        Tea redTea = redTeaFactory.create();
        redTea.make();

        Factory greenTeaFactory = new GreenTeaFactory();
        Tea greenTea = greenTeaFactory.create();
        greenTea.make();
    }
}
