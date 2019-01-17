package com.erp.dao;

import com.erp.pojo.DoorType;
import com.erp.pojo.DoorTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorTypeMapper {
    int countByExample(DoorTypeExample example);

    int deleteByExample(DoorTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorType record);

    int insertSelective(DoorType record);

    List<DoorType> selectByExample(DoorTypeExample example);

    DoorType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorType record, @Param("example") DoorTypeExample example);

    int updateByExample(@Param("record") DoorType record, @Param("example") DoorTypeExample example);

    int updateByPrimaryKeySelective(DoorType record);

    int updateByPrimaryKey(DoorType record);
}