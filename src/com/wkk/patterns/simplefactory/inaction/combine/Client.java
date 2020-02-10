package com.wkk.patterns.simplefactory.inaction.combine;

import com.wkk.patterns.simplefactory.inaction.user.Manager;
import com.wkk.patterns.simplefactory.inaction.user.AbsUser;
import com.wkk.patterns.simplefactory.inaction.user.UserDao;
import com.wkk.patterns.simplefactory.inaction.user.UserFactory;
import sun.rmi.server.UnicastServerRef;

/**
 * @Time: 20-2-10上午9:30
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserDao userDao = new UserDao();
        int permission = userDao.findPermission("wkk", "1111");
        AbsUser userType = UserFactory.getUserType(permission);
        UserProxy proxy = new UserProxy();
        proxy.setObject(userType);
        AbsUser usrProxy = (AbsUser) proxy.getProxy();
        usrProxy.diffOperation();
        usrProxy.sameOperation();
    }
}
