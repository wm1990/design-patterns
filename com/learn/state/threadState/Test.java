package com.learn.state.threadState;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.state.threadState
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/6 17:05
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
