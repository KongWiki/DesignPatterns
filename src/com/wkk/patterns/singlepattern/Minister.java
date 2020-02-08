package com.wkk.patterns.singlepattern;
/**
 * @Time: 20-02-02下午10:34
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */

public class Minister{
    public static void main(String[] args) {
        for(int day=0; day<3; day++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
