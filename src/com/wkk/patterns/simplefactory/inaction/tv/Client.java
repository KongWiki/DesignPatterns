package com.wkk.patterns.simplefactory.inaction.tv;

/**
 * @Time: 20-2-10上午8:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) throws Exception {
        TV haier = TVFactory.getTV("haier");
        haier.play();
        TV tcl = TVFactory.getTV("tcl");
        tcl.play();
    }
}
