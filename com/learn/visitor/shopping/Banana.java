package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Banana
 * @Description:具体商品
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:23
 * @Version: V1.0
 */
public class Banana extends Goods{
    public Banana(String name, Double price, Double amount) {
        super(name, price, amount);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getCost(){
        return "好吃，不易保存。";
    }
}
