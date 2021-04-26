package com.wkk.patterns.proxy.inaction.retrain;

/**
 * @Time: 20-2-9上午9:11
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        RealThemeA realThemeA = new RealThemeA();
        GenProxy genProxy = new GenProxy();
        genProxy.setObject(realThemeA);
        AbstractTheme absProxy = (AbstractTheme) genProxy.getProxy();
        absProxy.dosomething();
    }
}
