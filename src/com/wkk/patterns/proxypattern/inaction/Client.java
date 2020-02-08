package com.wkk.patterns.proxypattern.inaction;

/**
 * @Time: 20-2-8上午11:07
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) {
        PermissionProxy proxy = new PermissionProxy();
        proxy.setRealPermission(new RealPermission());
        proxy.modifyUserInfo();
        proxy.viewNote();
        proxy.publishNote();
        proxy.modifyNode();
        System.out.println("##########################");
        proxy.setLevel(1);
        proxy.modifyUserInfo();
        proxy.viewNote();
        proxy.publishNote();
        proxy.modifyNode();


    }
}
