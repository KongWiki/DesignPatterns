package com.wkk.patterns.proxypattern.inaction.dynamic;

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
}
