package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午9:08
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class UserDao {
    public int findPermission(String username, String password){
        if("wkk"==username && "1111"==password){
            return 1;
        }else {
            return -1;
        }
    }
}
