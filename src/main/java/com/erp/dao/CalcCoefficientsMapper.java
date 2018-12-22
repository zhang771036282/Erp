package com.erp.dao;

import com.erp.pojo.CalcCoefficients;
import com.erp.pojo.CalcCoefficientsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface CalcCoefficientsMapper {
    int countByExample(CalcCoefficientsExample example);

    int deleteByExample(CalcCoefficientsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CalcCoefficients record);

    int insertSelective(CalcCoefficients record);

    List<CalcCoefficients> selectByExample(CalcCoefficientsExample example);

    CalcCoefficients selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CalcCoefficients record, @Param("example") CalcCoefficientsExample example);

    int updateByExample(@Param("record") CalcCoefficients record, @Param("example") CalcCoefficientsExample example);

    int updateByPrimaryKeySelective(CalcCoefficients record);

    int updateByPrimaryKey(CalcCoefficients record);
}