package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午8:51
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Administrator implements AbsUser {
    public Administrator(){
        System.out.println("创建管理员对象");
    }

    @Override
    public void diffOperation() {
        System.out.println("管理员拥有创建和管理假权限");
    }

    @Override
    public void sameOperation() {
        System.out.println("修改个人资料");
    }
}
