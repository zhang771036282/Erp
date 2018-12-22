package com.erp.dao;

import com.erp.pojo.Schedule;
import com.erp.pojo.ScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface ScheduleMapper {
    int countByExample(ScheduleExample example);

    int deleteByExample(ScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);
}