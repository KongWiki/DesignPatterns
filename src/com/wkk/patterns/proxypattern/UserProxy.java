package com.wkk.patterns.proxypattern;

/**
 * @Time: 20-2-8上午10:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class UserProxy implements Subject{
    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    public void preRent(){
        System.out.println("中介帮客户租房之前, 去找房源");
    }

    public void postRent(){
        System.out.println("中介帮客户找到房子, 收取手续费");
    }

    @Override
    public void rent() {
        preRent();
        user.rent();
        postRent();
    }
}
