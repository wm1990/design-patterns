package com.learn.strategy.transport;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.strategy.transport
 * @ClassName: transportStrategy
 * @Description:策略管理类
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/2 0:03
 * @Version: V1.0
 */
public class TransportStrategy {
    private static Map<TransportType, ITransport> strategy = new HashMap<>();

    static {
        strategy.put(TransportType.CAR,new Car());
        strategy.put(TransportType.TRAIN,new Train());
        strategy.put(TransportType.PLANE,new Plane());
    }

    public ITransport getTransport(TransportType transportType){
        if(transportType == null){
            throw new RuntimeException("交通方式选择有误！");
        }
        return strategy.get(transportType);
    }
}
