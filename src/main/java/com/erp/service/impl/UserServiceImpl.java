package com.erp.service.impl;

import com.erp.dao.IUserDao;
import com.erp.pojo.User;
import com.erp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zph2 on 2018/12/12.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private IUserDao iUserDao;

    @Override
    public User selectUser(long userId) {

        return iUserDao.selectUser(userId);
    }
}
