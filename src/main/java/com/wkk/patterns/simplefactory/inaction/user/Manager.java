package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午8:51
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Manager implements AbsUser {
    public Manager(){
        System.out.println("创建了一个经理");
    }

    @Override
    public void diffOperation() {
        System.out.println("经理拥有创建和审批假条权限");
    }

    @Override
    public void sameOperation() {
        System.out.println("修改个人资料");
    }
}
