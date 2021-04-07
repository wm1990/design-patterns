package com.learn.adapter.objectAdapter;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.adapter.objectAdapter
 * @ClassName: ObjectAdapter
 * @Description:适配器类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/7 10:53
 * @Version: V1.0
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.doSomeThing();
        System.out.println("适配器要将适配者角色做转换了！！！");
    }
}
