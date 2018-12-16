package com.erp.service;

import com.erp.dao.IUserDao;
import com.erp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by zph2 on 2018/12/12.
 */
@Service
public class IUserService{

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private IUserDao iUserDao;

    public User selectUser(long userId) {
        return iUserDao.selectUser(userId);
    }
}
