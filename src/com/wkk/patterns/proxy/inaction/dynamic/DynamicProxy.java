package com.wkk.patterns.proxy.inaction.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Time: 20-2-8下午2:44
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public void preRequest() {
        System.out.println("调用前");
    }

    public void postResques() {
        System.out.println("调用后");
    }

    // InvocationHandler 和 Proxy搭配 构建动态代理
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    /**
     * @param proxy  代理类
     * @param method 需要代理的方法
     * @param args   代理方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        // 反射中 调用方法
        Object result = method.invoke(object, args);
        postResques();
        return result;
    }
}
