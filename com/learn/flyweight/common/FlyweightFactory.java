package com.learn.flyweight.common;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight
 * @ClassName: FlyweightFactory
 * @Description:享元工厂
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:07
 * @Version: V1.0
 */
public class FlyweightFactory {
    private ConcurrentHashMap<String, Flyweight> flyweightMap = new ConcurrentHashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key,flyweight);
        } else {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        }
        return flyweight;
    }
}
