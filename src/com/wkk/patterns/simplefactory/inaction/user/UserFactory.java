package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午8:59
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class UserFactory {
    public static AbsUser getUserType(int permission) throws Exception {
        if(0 == permission){
            return new Employee();
        }else if ( 1 == permission){
            return new Manager();
        }else if ( 2 == permission){
            return new Administrator();
        }else {
            throw new Exception("没有该角色, 或账号密码错误");
        }
    }
}
