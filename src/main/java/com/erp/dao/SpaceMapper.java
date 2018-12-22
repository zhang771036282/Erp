package com.erp.dao;

import com.erp.pojo.Space;
import com.erp.pojo.SpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface SpaceMapper {
    int countByExample(SpaceExample example);

    int deleteByExample(SpaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Space record);

    int insertSelective(Space record);

    List<Space> selectByExample(SpaceExample example);

    Space selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Space record, @Param("example") SpaceExample example);

    int updateByExample(@Param("record") Space record, @Param("example") SpaceExample example);

    int updateByPrimaryKeySelective(Space record);

    int updateByPrimaryKey(Space record);
}