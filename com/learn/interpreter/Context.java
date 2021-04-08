package com.learn.interpreter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.interpreter
 * @ClassName: Context
 * @Description:上下文环境
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 22:44
 * @Version: V1.0
 */
public class Context {
    public int operation(String formula){
        int result = 0;
        if(formula.contains("+")){
            result = addOperation(formula);
        }else if(formula.contains("-")){
            result = subOperation(formula);
        }else if(formula.contains("*")){
            result = multiOperation(formula);
        }else if(formula.contains("/")){
            result = divOperation(formula);
        }
        return result;
    }

    private int addOperation(String formula) {
        String s[] = formula.split("\\+");
        Expression leftNum = new TerminalExpression(Integer.parseInt(s[0].trim()));
        Expression rightNum = new TerminalExpression(Integer.parseInt(s[1].trim()));
        Expression result = new AddExpression(leftNum,rightNum);
        return result.interpret();
    }

    private int subOperation(String formula) {
        String s[] = formula.split("-");
        Expression leftNum = new TerminalExpression(Integer.parseInt(s[0].trim()));
        Expression rightNum = new TerminalExpression(Integer.parseInt(s[1].trim()));
        Expression result = new SubExpression(leftNum,rightNum);
        return result.interpret();
    }

    private int multiOperation(String formula) {
        String s[] = formula.split("\\*");
        Expression leftNum = new TerminalExpression(Integer.parseInt(s[0].trim()));
        Expression rightNum = new TerminalExpression(Integer.parseInt(s[1].trim()));
        Expression result = new MultiExpression(leftNum,rightNum);
        return result.interpret();
    }

    private int divOperation(String formula) {
        String s[] = formula.split("/");
        Expression leftNum = new TerminalExpression(Integer.parseInt(s[0].trim()));
        Expression rightNum = new TerminalExpression(Integer.parseInt(s[1].trim()));
        Expression result = new DivExpression(leftNum,rightNum);
        return result.interpret();
    }
}
