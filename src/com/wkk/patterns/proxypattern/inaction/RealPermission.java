package com.wkk.patterns.proxypattern.inaction;

/**
 * @Time: 20-2-8上午11:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNote() {
        System.out.println("发布一个帖子");

    }

    @Override
    public void modifyNode() {
        System.out.println("修改一个帖子");

    }

    @Override
    public void setLevel(int level) {

    }
}
