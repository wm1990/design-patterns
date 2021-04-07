package com.learn.chainOfResponsibility.approvalOfLeave;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.chainOfResponsibility.approvalOfLeave
 * @ClassName: ProjectManager
 * @Description:CEO审批
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/3 23:26
 * @Version: V1.0
 */
public class CEOHandler extends LeaderHandler{
    @Override
    void approve(int leaveDays) {
            System.out.println("CEO批准请假" + leaveDays + "天。");
    }
}
