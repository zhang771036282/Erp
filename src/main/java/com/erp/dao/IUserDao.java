package com.erp.dao;

import com.erp.pojo.User;

/**
 * Created by zph2 on 2018/12/12.
 */
public interface IUserDao {
    User selectUser(long id);
}
