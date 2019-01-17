package com.erp.dao;

import com.erp.pojo.DoorTypeParts;
import com.erp.pojo.DoorTypePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorTypePartsMapper {
    int countByExample(DoorTypePartsExample example);

    int deleteByExample(DoorTypePartsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorTypeParts record);

    int insertSelective(DoorTypeParts record);

    List<DoorTypeParts> selectByExample(DoorTypePartsExample example);

    DoorTypeParts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorTypeParts record, @Param("example") DoorTypePartsExample example);

    int updateByExample(@Param("record") DoorTypeParts record, @Param("example") DoorTypePartsExample example);

    int updateByPrimaryKeySelective(DoorTypeParts record);

    int updateByPrimaryKey(DoorTypeParts record);
}