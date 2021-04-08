package com.learn.memento.recruit;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.recruit
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:50
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        TalentPool talentPool = new TalentPool();
        //候选人1
        company.setEmployeeName("张三");
        company.setSalary(15000.00);
        Candidate candidate1 = company.createMemento();
        talentPool.addCandidate(candidate1);
        //候选人2
        company.setEmployeeName("李四");
        company.setSalary(18000.00);
        Candidate candidate2 = company.createMemento();
        talentPool.addCandidate(candidate2);
        //候选人3
        company.setEmployeeName("王五");
        company.setSalary(20000.00);
        Candidate candidate3 = company.createMemento();
        talentPool.addCandidate(candidate3);
        //恢复候选人2
        company.restoreMemento(talentPool.getCandidate("李四"));
        System.out.println("确定录用候选人："+company.getEmployeeName()+"，薪水："+company.getSalary());
    }
}
