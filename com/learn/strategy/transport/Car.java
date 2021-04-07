package com.learn.strategy.transport;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.transport
 * @ClassName: Car
 * @Description:汽车
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/2 0:01
 * @Version: V1.0
 */
public class Car implements ITransport{
    @Override
    public void goOut() {
        System.out.println("近距离出行，选择汽车！！！");
    }
}
