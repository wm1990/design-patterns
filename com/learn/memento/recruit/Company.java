package com.learn.memento.recruit;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.recruit
 * @ClassName: Company
 * @Description:发起人
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:38
 * @Version: V1.0
 */
public class Company {
    private String employeeName;

    private Double salary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Candidate createMemento() {
        System.out.println("候选人"+employeeName+"进入人才库！");
        return new Candidate(employeeName,salary);
    }

    public void restoreMemento(Candidate candidate) {
        this.setEmployeeName(candidate.getName());
        this.setSalary(candidate.getSalary());
    }
}
