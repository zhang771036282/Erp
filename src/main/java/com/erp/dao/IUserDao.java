package com.erp.dao;

import com.erp.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zph2 on 2018/12/12.
 */
@Mapper
public interface IUserDao {

    @Select("select * from user where id = #{id}")
    User selectUser(long id);
}
