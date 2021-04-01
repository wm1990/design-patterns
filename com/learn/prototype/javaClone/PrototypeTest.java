package com.learn.prototype.javaClone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.prototype.javaClone
 * @ClassName: PrototypeTest
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:34
 * @Version: V1.0
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setId("1");
        prototype.setName("zhangsan");
        List<String> address = new ArrayList<>();
        address.add("北京");
        address.add("上海");
        prototype.setAddress(address);
        System.out.println(prototype.toString());
        //复制对象
        Prototype clonePrototype = prototype.clone();
        clonePrototype.getAddress().add("广州");
        System.out.println(clonePrototype.toString());
        System.out.println(prototype.toString());
    }
}
