package com.learn.strategy.transport;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.transport
 * @ClassName: Test
 * @Description:测试类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/2 0:16
 * @Version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        TransportStrategy strategy = new TransportStrategy();
        ITransport transport = strategy.getTransport(TransportType.PLANE);
        transport.goOut();
    }
}
