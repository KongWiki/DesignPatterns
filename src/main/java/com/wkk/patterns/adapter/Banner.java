package com.wkk.patterns.adapter;

/**
 * @Time: 19-12-28下午4:31
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");

    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
