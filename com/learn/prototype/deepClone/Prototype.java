package com.learn.prototype.deepClone;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.prototype.deepClone
 * @ClassName: Prototype
 * @Description:原型类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 15:35
 * @Version: V1.0
 */
public class Prototype implements Cloneable{

    private String id;

    private String name;

    private List<String> address;

    public Prototype deepClone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        List<String> address = prototype.getAddress();
        List<String> cloneAddress = (List<String>) ((ArrayList)address).clone();
        prototype.setAddress(cloneAddress);
        return prototype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "prototype:{id:'"+id+"',name:"+name+"',address:'"+address+"'}";
    }
}
