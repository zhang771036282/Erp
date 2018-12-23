package com.erp.dao;

import com.erp.pojo.Board;
import com.erp.pojo.BoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface BoardMapper {
    int countByExample(BoardExample example);

    int deleteByExample(BoardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Board record);

    int insertSelective(Board record);

    List<Board> selectByExample(BoardExample example);

    Board selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Board record, @Param("example") BoardExample example);

    int updateByExample(@Param("record") Board record, @Param("example") BoardExample example);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKey(Board record);

    /**
     * 根据编号或者ID查询基材的数量
     * @param code 基材编号
     * @return
     */
    int findBoardCountByCode(@Param("code")String code);
}