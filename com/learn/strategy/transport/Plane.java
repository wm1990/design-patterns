package com.learn.strategy.transport;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.transport
 * @ClassName: plane
 * @Description:飞机
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 23:58
 * @Version: V1.0
 */
public class Plane implements ITransport{
    @Override
    public void goOut() {
        System.out.println("远距离出行，选择飞机！！！");
    }
}
