package com.wkk.patterns.simplefactory.inaction.tv;

/**
 * @Time: 20-2-10上午8:33
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class HisenseTV implements TV{

    @Override
    public void play() {
        System.out.println("Hisense TV");
    }
}
