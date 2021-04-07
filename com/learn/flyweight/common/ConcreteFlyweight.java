package com.learn.flyweight.common;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight
 * @ClassName: ConcreteFlyweight
 * @Description:具体享元角色
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:04
 * @Version: V1.0
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key){
        this.key = key;
        System.out.println("具体享元对象" + key + "被创建！");
    }

    @Override
    public void operation(String outState) {
        System.out.print("具体享元对象" + key + "被调用，");
        System.out.println("外部状态是:" + outState);
    }
}
