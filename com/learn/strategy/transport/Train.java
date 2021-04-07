package com.learn.strategy.transport;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.transport
 * @ClassName: train
 * @Description:火车
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 23:59
 * @Version: V1.0
 */
public class Train implements ITransport{
    @Override
    public void goOut() {
        System.out.println("中等距离出行，选择高铁！！！");
    }
}
