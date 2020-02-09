package com.wkk.patterns.proxy.inaction.retrain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Time: 20-2-9上午9:14
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class GenProxy implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public void preDoSomething(){
        System.out.println("做事之前, 代理需要做的处理");
    }

    public void postDoSomenthing(){
        System.out.println("做事之后, 代理需要做的事情");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preDoSomething();
        Object invoke = method.invoke(object, args);
        postDoSomenthing();
        return invoke;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
}
