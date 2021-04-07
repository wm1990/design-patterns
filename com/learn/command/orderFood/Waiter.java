package com.learn.command.orderFood;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.command.orderFood
 * @ClassName: Waiter
 * @Description:服务员（请求者）
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/4 15:27
 * @Version: V1.0
 */
public class Waiter {
    private static List<IFood> foods = new ArrayList<>();

    public void AddCook(IFood food){
        foods.add(food);
    }

    public void command(IFood food){
        food.cooking();
    }

    public void commands(){
        for (IFood food : foods){
            food.cooking();
        }
    }
}
