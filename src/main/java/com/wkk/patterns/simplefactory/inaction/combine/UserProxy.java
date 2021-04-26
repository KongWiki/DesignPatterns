package com.wkk.patterns.simplefactory.inaction.combine;

import com.wkk.patterns.simplefactory.inaction.user.AbsUser;
import com.wkk.patterns.simplefactory.inaction.user.UserDao;
import com.wkk.patterns.simplefactory.inaction.user.UserFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Time: 20-2-10上午9:20
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class UserProxy implements InvocationHandler {
    private int level = -1;

    public Object object;
    public UserDao userDao;

    public void setObject(Object object){
        this.object = object;
    }

    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        return invoke;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
}

