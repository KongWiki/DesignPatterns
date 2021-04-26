package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午8:51
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Employee implements AbsUser {
    public Employee(){
        System.out.println("创建了一个员工");
    }

    @Override
    public void diffOperation() {
        System.out.println("员工拥有申请假条的权利!");
    }

    @Override
    public void sameOperation() {
        System.out.println("修改个人资料");
    }
}
