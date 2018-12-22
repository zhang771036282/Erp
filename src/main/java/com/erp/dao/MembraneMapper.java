package com.erp.dao;

import com.erp.pojo.Membrane;
import com.erp.pojo.MembraneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface MembraneMapper {
    int countByExample(MembraneExample example);

    int deleteByExample(MembraneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Membrane record);

    int insertSelective(Membrane record);

    List<Membrane> selectByExample(MembraneExample example);

    Membrane selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Membrane record, @Param("example") MembraneExample example);

    int updateByExample(@Param("record") Membrane record, @Param("example") MembraneExample example);

    int updateByPrimaryKeySelective(Membrane record);

    int updateByPrimaryKey(Membrane record);
}