package com.learn.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: [design-patterns]
 * @Package: com.learn.proxy.cglibProxy
 * @ClassName: CglibProxy
 * @Description:Cglib动态代理
 * @Author: [wangmeng]
 * @CreateDate: 2021/4/1 16:12
 * @Version: V1.0
 */
public class CglibProxy implements MethodInterceptor {
    public ISubject getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (ISubject) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeRequest();
        methodProxy.invokeSuper(o,objects);
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
