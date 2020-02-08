package com.wkk.patterns.adapter;

/**
 * @Time: 19-12-28下午7:42
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
