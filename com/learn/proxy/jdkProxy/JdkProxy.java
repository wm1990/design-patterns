package com.learn.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.jdkProxy
 * @ClassName: JdkProxy
 * @Description:Jdk动态代理
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:09
 * @Version: V1.0
 */
public class JdkProxy implements InvocationHandler {
    private ISubject target;
    public ISubject getInstance(ISubject target){
        this.target = target;
        Class<? extends ISubject> clazz =  target.getClass();
        return (ISubject) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeRequest();
        method.invoke(this.target,args);
        afterRequest();
        return null;
    }

    private void beforeRequest() {
        System.out.println("前置处理...");
    }

    private void afterRequest() {
        System.out.println("后置处理...");
    }
}
