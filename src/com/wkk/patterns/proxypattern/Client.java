package com.wkk.patterns.proxypattern;

/**
 * @Time: 20-2-8上午10:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        UserProxy proxy = new UserProxy(user);
        proxy.rent();

    }
}
