package com.wkk.patterns.adapter;

/**
 * @Time: 19-12-28下午6:55
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();

    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
