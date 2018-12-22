package com.erp.dao;

import com.erp.pojo.EdgeShape;
import com.erp.pojo.EdgeShapeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface EdgeShapeMapper {
    int countByExample(EdgeShapeExample example);

    int deleteByExample(EdgeShapeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EdgeShape record);

    int insertSelective(EdgeShape record);

    List<EdgeShape> selectByExample(EdgeShapeExample example);

    EdgeShape selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EdgeShape record, @Param("example") EdgeShapeExample example);

    int updateByExample(@Param("record") EdgeShape record, @Param("example") EdgeShapeExample example);

    int updateByPrimaryKeySelective(EdgeShape record);

    int updateByPrimaryKey(EdgeShape record);
}