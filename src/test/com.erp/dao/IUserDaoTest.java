package com.erp.dao;

import com.erp.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
class IUserDaoTest {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private IUserDao IUserDao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = IUserDao.selectUser(id);
        System.out.println(user.getUsername());
    }
}