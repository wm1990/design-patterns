package com.learn.decorator.evolution;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.decorator.evolution
 * @ClassName: Changer
 * @Description:抽象装饰类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:33
 * @Version: V1.0
 */
public class Changer implements IAgumon{
    private IAgumon agumon;

    public Changer(IAgumon agumon){
        this.agumon = agumon;
    }

    @Override
    public void display() {
        agumon.display();
    }
}
