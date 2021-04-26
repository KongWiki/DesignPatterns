package com.wkk.patterns.proxy;

/**
 * @Time: 20-2-8上午10:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class User implements Subject {
    @Override
    public void rent() {
        System.out.println("用户我要租房子");
    }
}
