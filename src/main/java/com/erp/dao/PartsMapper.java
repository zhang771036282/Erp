package com.erp.dao;

import com.erp.pojo.Parts;
import com.erp.pojo.PartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface PartsMapper {
    int countByExample(PartsExample example);

    int deleteByExample(PartsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parts record);

    int insertSelective(Parts record);

    List<Parts> selectByExample(PartsExample example);

    Parts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parts record, @Param("example") PartsExample example);

    int updateByExample(@Param("record") Parts record, @Param("example") PartsExample example);

    int updateByPrimaryKeySelective(Parts record);

    int updateByPrimaryKey(Parts record);
}