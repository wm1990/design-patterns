package com.learn.flyweight.houseAgent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.flyweight.houseAgent
 * @ClassName: HouseFactory
 * @Description:房源工厂
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/29 23:41
 * @Version: V1.0
 */
public class HouseFactory {
    private static ConcurrentHashMap<String,IHouse> houseMap = new ConcurrentHashMap<>();

    public static IHouse getHouseMag(String address){
        if(houseMap.containsKey(address)){
            System.out.println("缓存查看："+address);
            return houseMap.get(address);
        }
        System.out.println("首次查看，创建房源！");
        IHouse house = new House(address);
        houseMap.put(address,house);
        return house;
    }
}
