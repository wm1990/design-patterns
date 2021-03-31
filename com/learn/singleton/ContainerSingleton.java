package com.learn.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.singleton
 * @ClassName: ContainerSingleton
 * @Description:容器式单例
 * @Author: [wangmeng]
 * @CreateDate: 2021/3/31 10:27
 * @Version: V1.0
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> IOC = new ConcurrentHashMap<>();

    public static Object getBean(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (IOC){
            if(IOC.containsKey(className)){
                return IOC.get(className);
            }else {
                return Class.forName(className).newInstance();
            }
        }
    }
}
