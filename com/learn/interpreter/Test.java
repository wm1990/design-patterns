package com.learn.interpreter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.interpreter
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 23:06
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        int addResult = context.operation("12 + 13");
        System.out.println("12 + 13 = " + addResult);
        int subResult = context.operation("12 - 7");
        System.out.println("12 + 7 = " + subResult);
        int multiResult = context.operation("12 * 13");
        System.out.println("12 * 13 = " + multiResult);
        int divResult = context.operation("39 / 13");
        System.out.println("39 / 13 = " + divResult);
    }
}
