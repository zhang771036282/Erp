package com.erp.dao;

import com.erp.pojo.ReplenishmentOrder;
import com.erp.pojo.ReplenishmentOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface ReplenishmentOrderMapper {
    int countByExample(ReplenishmentOrderExample example);

    int deleteByExample(ReplenishmentOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReplenishmentOrder record);

    int insertSelective(ReplenishmentOrder record);

    List<ReplenishmentOrder> selectByExample(ReplenishmentOrderExample example);

    ReplenishmentOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReplenishmentOrder record, @Param("example") ReplenishmentOrderExample example);

    int updateByExample(@Param("record") ReplenishmentOrder record, @Param("example") ReplenishmentOrderExample example);

    int updateByPrimaryKeySelective(ReplenishmentOrder record);

    int updateByPrimaryKey(ReplenishmentOrder record);
}