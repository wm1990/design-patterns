package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Apple
 * @Description:具体商品
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:21
 * @Version: V1.0
 */
public class Apple extends Goods{
    public Apple(String name, Double price, Double amount) {
        super(name, price, amount);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getCost(){
        return "好吃不贵，易于保存。";
    }
}
