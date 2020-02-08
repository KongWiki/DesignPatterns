package com.wkk.patterns.proxypattern.inaction.permission;

/**
 * @Time: 20-2-8上午11:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public interface AbstractPermission {
    // 修改用户信息(需要登录之后)
    void modifyUserInfo();

    // 浏览内容
    void viewNote();

    // 发布内容
    void publishNote();

    // 修改内容
    void modifyNode();

    // 登录判断
    void setLevel(int level);
}
