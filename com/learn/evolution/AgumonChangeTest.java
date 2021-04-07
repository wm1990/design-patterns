package com.learn.decorator.evolution;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator.evolution
 * @ClassName: AgumonChangeTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:34
 * @Version: V1.0
 */
public class AgumonChangeTest {
    public static void main(String[] args) {
        IAgumon agumon = new Agumon();
        IAgumon greymon = new Greymon(agumon);
        greymon.display();
        System.out.println("-----------------分割线-----------------------");
        IAgumon metalGreymon = new MetalGreymon(greymon);
        metalGreymon.display();
    }
}
