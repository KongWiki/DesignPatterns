package com.wkk.patterns.proxy.inaction.dynamic;

/**
 * @Time: 20-2-8下午2:43
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class RealSubjectA implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("主题A");
    }

    @Override
    public void anotherRequest() {
        System.out.println("另一个请求I");
    }
}
