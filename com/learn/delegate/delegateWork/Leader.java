package com.learn.delegate.delegateWork;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.delegate.delegateWork
 * @ClassName: Leader
 * @Description:经理，委派者
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 23:10
 * @Version: V1.0
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> employees = new HashMap<>();

    public Leader(){
        employees.put("研发",new ZhangSan());
        employees.put("销售",new Lisi());
    }

    @Override
    public void work(String task) {
        if(employees.containsKey(task)){
            employees.get(task).work(task);
        }else{
            System.out.println(task+"，干不了！！！");
        }
    }
}
