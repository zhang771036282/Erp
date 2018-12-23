package com.erp.service;

import com.erp.dao.BoardMapper;
import com.erp.pojo.Board;
import com.erp.pojo.BoardExample;
import com.erp.pojo.BoardExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author zph2
 * @date 2018/12/22
 */
@Service
public class BoardService {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private BoardMapper boardMapper;

    /**
     * 查询全部的基材并且模糊查询
     * @param code
     * @return
     */
    public List<Board> findBoardByCode(String code) {
        if(code.equals("") || code == "") {
            return boardMapper.selectByExample(null);
        }
        BoardExample example = new BoardExample();
        Criteria criteria = example.createCriteria();
        criteria.andNameLike("%"+code+"%");
        return boardMapper.selectByExample(example);
    }


    public int insertSelective(Board record) {
        if(boardMapper.findBoardCountByCode(record.getCode())>0) {
            return 0;
        }
        return boardMapper.insertSelective(record);
    }

    public int updateByPrimaryKeySelective(Board record) {
        Board board = boardMapper.selectByPrimaryKey(record.getId());
        if(board == null) {
            return 0;
        }
        return boardMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteByPrimaryKey(Integer id) {
        return boardMapper.deleteByPrimaryKey(id);
    }
}
