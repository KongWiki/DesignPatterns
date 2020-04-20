package com.wkk.patterns.proxy.cglib;

/**
 * @Time: 2020/4/20上午10:30
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Dao {
    public void update(){
        System.out.println("dao update 方法");
    }

    public void select(){
        System.out.println("dao select 方法");
    }
}
