package com.wkk.patterns.proxy.inaction.dynamic;

/**
 * @Time: 20-2-8下午2:43
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class RealSubjectB implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("主题B");
    }

    @Override
    public void anotherRequest() {
        System.out.println("另一个请求II");
    }
}
