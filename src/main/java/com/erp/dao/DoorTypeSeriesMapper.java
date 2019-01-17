package com.erp.dao;

import com.erp.pojo.DoorTypeSeries;
import com.erp.pojo.DoorTypeSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorTypeSeriesMapper {
    int countByExample(DoorTypeSeriesExample example);

    int deleteByExample(DoorTypeSeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorTypeSeries record);

    int insertSelective(DoorTypeSeries record);

    List<DoorTypeSeries> selectByExample(DoorTypeSeriesExample example);

    DoorTypeSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorTypeSeries record, @Param("example") DoorTypeSeriesExample example);

    int updateByExample(@Param("record") DoorTypeSeries record, @Param("example") DoorTypeSeriesExample example);

    int updateByPrimaryKeySelective(DoorTypeSeries record);

    int updateByPrimaryKey(DoorTypeSeries record);
}