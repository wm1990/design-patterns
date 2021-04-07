package com.learn.decorator.evolution;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator.evolution
 * @ClassName: Greymon
 * @Description:具体装饰类：暴龙兽
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:33
 * @Version: V1.0
 */
public class Greymon extends Changer{
    public Greymon(IAgumon agumon) {
        super(agumon);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("亚古兽进化--->暴龙兽");
        System.out.println("技能：超级火焰！！！");
    }
}
