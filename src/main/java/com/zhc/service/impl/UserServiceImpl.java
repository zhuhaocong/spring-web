package com.zhc.service.impl;

import com.zhc.dao.UserDao;
import com.zhc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show() {
        userDao.show();
    }
}
