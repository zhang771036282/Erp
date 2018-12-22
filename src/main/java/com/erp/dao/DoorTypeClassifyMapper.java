package com.erp.dao;

import com.erp.pojo.DoorTypeClassify;
import com.erp.pojo.DoorTypeClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface DoorTypeClassifyMapper {
    int countByExample(DoorTypeClassifyExample example);

    int deleteByExample(DoorTypeClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorTypeClassify record);

    int insertSelective(DoorTypeClassify record);

    List<DoorTypeClassify> selectByExample(DoorTypeClassifyExample example);

    DoorTypeClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorTypeClassify record, @Param("example") DoorTypeClassifyExample example);

    int updateByExample(@Param("record") DoorTypeClassify record, @Param("example") DoorTypeClassifyExample example);

    int updateByPrimaryKeySelective(DoorTypeClassify record);

    int updateByPrimaryKey(DoorTypeClassify record);
}