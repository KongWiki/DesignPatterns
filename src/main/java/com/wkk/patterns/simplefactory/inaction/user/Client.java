package com.wkk.patterns.simplefactory.inaction.user;

/**
 * @Time: 20-2-10上午9:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDao();
        int result = userDao.findPermission("wkk", "1111");
        AbsUser user = UserFactory.getUserType(result);
        user.sameOperation();
        user.diffOperation();



    }
}
