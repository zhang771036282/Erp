package com.erp.dao;

import com.erp.pojo.Board;
import com.erp.pojo.BoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zph2
 */
public interface BoardMapper {
    /**
     * 查询总数
     * @param example
     * @return
     */
    int countByExample(BoardExample example);

    /**
     * 删除
     * @param example
     * @return
     */
    int deleteByExample(BoardExample example);

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加
     * @param record
     * @return
     */
    int insert(Board record);

    /**
     *添加
     * @param record
     * @return
     */
    int insertSelective(Board record);

    /**
     * 查询多个
     * @param example
     * @return
     */
    List<Board> selectByExample(BoardExample example);

    /**
     * 查询单个
     * @param id
     * @return
     */
    Board selectByPrimaryKey(Integer id);

    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") Board record, @Param("example") BoardExample example);

    /**
     * 更新
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") Board record, @Param("example") BoardExample example);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Board record);

    /**
     * 根据ID更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Board record);

    /**
     * 根据编号或者ID查询基材的数量
     * @param code 基材编号
     * @return
     */
    int findBoardCountByCode(@Param("code")String code);
}