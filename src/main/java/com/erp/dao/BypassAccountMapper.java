package com.erp.dao;

import com.erp.pojo.BypassAccount;
import com.erp.pojo.BypassAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BypassAccountMapper {
    int countByExample(BypassAccountExample example);

    int deleteByExample(BypassAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BypassAccount record);

    int insertSelective(BypassAccount record);

    List<BypassAccount> selectByExample(BypassAccountExample example);

    BypassAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BypassAccount record, @Param("example") BypassAccountExample example);

    int updateByExample(@Param("record") BypassAccount record, @Param("example") BypassAccountExample example);

    int updateByPrimaryKeySelective(BypassAccount record);

    int updateByPrimaryKey(BypassAccount record);
}