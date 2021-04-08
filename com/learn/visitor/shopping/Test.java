package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:39
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("==============顾客看商品================");
        shoppingCart.showGoods(new Customer());
        System.out.println("==============商家看商品================");
        shoppingCart.showGoods(new Saler());
    }
}
