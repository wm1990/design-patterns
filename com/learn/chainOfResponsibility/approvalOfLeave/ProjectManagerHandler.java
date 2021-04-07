package com.learn.chainOfResponsibility.approvalOfLeave;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.approvalOfLeave
 * @ClassName: ProjectManager
 * @Description:项目经理审批
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 23:26
 * @Version: V1.0
 */
public class ProjectManagerHandler extends LeaderHandler{
    @Override
    void approve(int leaveDays) {
        if (leaveDays <= 3) {
            System.out.println("项目经理批准请假" + leaveDays + "天。");
        } else {
            chain.approve(leaveDays);
        }
    }
}
