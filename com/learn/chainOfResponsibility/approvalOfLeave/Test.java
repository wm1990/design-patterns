package com.learn.chainOfResponsibility.approvalOfLeave;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.approvalOfLeave
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 23:39
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.addHandler(new ProjectManagerHandler())
                .addHandler(new DeptManagerHandler())
                .addHandler(new CEOHandler());

        builder.build().approve(5);
    }
}
