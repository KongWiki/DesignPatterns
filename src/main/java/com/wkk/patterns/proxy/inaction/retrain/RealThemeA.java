package com.wkk.patterns.proxy.inaction.retrain;


/**
 * @Time: 20-2-9上午9:14
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class RealThemeA implements AbstractTheme {
    @Override
    public void dosomething() {
        System.out.println("A do something");
    }
}
