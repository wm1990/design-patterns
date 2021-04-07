package com.learn.flyweight.houseAgent;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight.houseAgent
 * @ClassName: HouseTest
 * @Description: 测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:47
 * @Version: V1.0
 */
public class HouseTest {
    public static void main(String[] args) {
        IHouse house1 = HouseFactory.getHouseMag("北京天安门");
        house1.showMsg("张三");
        IHouse house2 = HouseFactory.getHouseMag("北京天安门");
        house2.showMsg("李四");
        IHouse house3 = HouseFactory.getHouseMag("北京天安门");
        house3.showMsg("王五");
    }
}
