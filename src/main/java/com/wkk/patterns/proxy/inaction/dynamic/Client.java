package com.wkk.patterns.proxy.inaction.dynamic;

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
        AbstractSubject absProxy = (AbstractSubject) proxy.getProxy();
        absProxy.request();
        absProxy.anotherRequest();

    }
}
