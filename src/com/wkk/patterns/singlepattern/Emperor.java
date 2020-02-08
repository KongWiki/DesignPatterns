package com.wkk.patterns.singlepattern;

/**
 * @Time: 20-02-02下午10:27
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */

public class Emperor {
    private static final Emperor emperor = new Emperor();

    //私有化构造方法 避免出现多个对象
    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我是只能创建一个对象的程序");

    }

}
