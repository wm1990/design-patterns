package com.learn.decorator.evolution;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator.evolution
 * @ClassName: Agumon
 * @Description:具体构件：亚古兽
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:32
 * @Version: V1.0
 */
public class Agumon implements IAgumon{
    @Override
    public void display() {
        System.out.println("我是亚古兽！！！");
        System.out.println("技能：小型火焰！！！");
    }
}
