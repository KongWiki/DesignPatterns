package com.wkk.patterns.simplefactory.inaction.tv;

/**
 * @Time: 20-2-10上午8:33
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class SkyworthTV implements TV{
    @Override
    public void play() {
        System.out.println("我是创维电视");
    }
}
