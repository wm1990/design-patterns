package com.learn.interpreter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.interpreter
 * @ClassName: DivExpression
 * @Description:非终结符表达式
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 22:42
 * @Version: V1.0
 */
public class DivExpression implements Expression{
    private Expression leftNum;

    private Expression rightNum;

    public DivExpression(Expression leftNum, Expression rightNum){
        this.leftNum = leftNum;
        this.rightNum = rightNum;
    }

    @Override
    public int interpret() {
        return leftNum.interpret() / rightNum.interpret();
    }
}
