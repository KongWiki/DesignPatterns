package com.wkk.patterns.proxypattern.inaction.dynamic;

import com.sun.corba.se.spi.presentation.rmi.DynamicStub;

import javax.swing.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Time: 20-2-8下午3:11
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        RealSubjectB realSubjectB = new RealSubjectB();
        RealSubjectA realSubjectA = new RealSubjectA();

        DynamicProxy proxy = new DynamicProxy();
        // 注入需要的实现类
        proxy.setObject(realSubjectB);
        // 获取相应主题的动态代理
        AbstractSubject proxy1 = (AbstractSubject) proxy.getProxy();
        proxy1.request();

    }
}
