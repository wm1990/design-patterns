package com.learn.decorator.evolution;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator.evolution
 * @ClassName: MetalGreymon
 * @Description:具体装饰类：机械暴龙兽
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:34
 * @Version: V1.0
 */
public class MetalGreymon extends Changer{
    public MetalGreymon(IAgumon agumon) {
        super(agumon);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("暴龙兽进化--->机械暴龙兽");
        System.out.println("技能：究极破坏炮！！！");
    }
}
