package com.learn.adapter.classAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.classAdapter
 * @ClassName: ClassAdapter
 * @Description:适配器类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:46
 * @Version: V1.0
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        doSomeThing();
        System.out.println("适配器要将适配者角色做转换了！！！");
    }
}
