package com.learn.visitor.shopping;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.visitor.shopping
 * @ClassName: Goods
 * @Description:抽象商品
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/8 14:01
 * @Version: V1.0
 */
public abstract class Goods {
    private String name;

    private Double price;

    private Double amount;

    public Goods(String name,Double price,Double amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return amount;
    }

    public abstract void accept(IVisitor visitor);
}
