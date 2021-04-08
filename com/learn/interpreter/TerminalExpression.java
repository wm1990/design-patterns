package com.learn.interpreter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.interpreter
 * @ClassName: TerminalExpression
 * @Description:终结符表达式
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 22:34
 * @Version: V1.0
 */
public class TerminalExpression implements Expression{
    private int num;

    public TerminalExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
