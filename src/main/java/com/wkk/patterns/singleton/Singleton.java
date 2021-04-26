package com.wkk.patterns.singleton;

/**
 * @Time: 20-2-9上午9:57
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
