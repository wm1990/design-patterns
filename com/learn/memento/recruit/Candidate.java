package com.learn.memento.recruit;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.memento.recruit
 * @ClassName: Candidate
 * @Description:候选人（备忘录）
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 16:35
 * @Version: V1.0
 */
public class Candidate {
    private String name;

    private Double salary;

    public Candidate(String name,Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
