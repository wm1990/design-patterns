package com.learn.flyweight.houseAgent;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight.houseAgent
 * @ClassName: house
 * @Description:具体房源类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:37
 * @Version: V1.0
 */
public class House implements IHouse{
    private String address;

    public House(String address){
        this.address = address;
        System.out.println("创建房源："+address);
    }

    @Override
    public void showMsg(String anency) {
        System.out.println("中介"+anency+"带看房源："+address);
    }
}
