package com.learn.visitor.shopping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: ShoppingCart
 * @Description:购物车
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:41
 * @Version: V1.0
 */
public class ShoppingCart {
    static List<Goods> goods = new ArrayList<>();

    static {
        goods.add(new Apple("红富士苹果",4.00,3.00));
        goods.add(new Apple("花牛苹果",6.00,2.00));
        goods.add(new Apple("国产香蕉",5.00,2.00));
        goods.add(new Apple("进口香蕉",8.00,2.00));
    }

    public void showGoods(IVisitor visitor){
        for (Goods good : goods) {
            good.accept(visitor);
        }
    }
}
