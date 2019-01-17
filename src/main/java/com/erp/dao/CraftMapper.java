package com.erp.dao;

import com.erp.pojo.Craft;
import com.erp.pojo.CraftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CraftMapper {
    int countByExample(CraftExample example);

    int deleteByExample(CraftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Craft record);

    int insertSelective(Craft record);

    List<Craft> selectByExample(CraftExample example);

    Craft selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Craft record, @Param("example") CraftExample example);

    int updateByExample(@Param("record") Craft record, @Param("example") CraftExample example);

    int updateByPrimaryKeySelective(Craft record);

    int updateByPrimaryKey(Craft record);
}