package com.wkk.patterns.proxy.inaction.permission;

/**
 * @Time: 20-2-8上午11:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class PermissionProxy implements AbstractPermission {
    private RealPermission realPermission;
    private int level = 0;

    public void setRealPermission(RealPermission realPermission) {
        this.realPermission = realPermission;
    }


    @Override
    public void modifyUserInfo() {
        if (0 == level) {
            System.out.println("对不起, 你没有权限! 修改用户信息");
        } else if (1 == level) {
            realPermission.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
        realPermission.viewNote();

    }

    @Override
    public void publishNote() {
        if (0 == level) {
            System.out.println("对不起, 你没有权限! 发布帖子");
        } else if (1 == level) {
            realPermission.publishNote();
        }
    }

    @Override
    public void modifyNode() {
        if (0 == level) {
            System.out.println("对不起, 你没有权限! 修改帖子");
        } else if (1 == level) {
            realPermission.modifyUserInfo();
        }
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
