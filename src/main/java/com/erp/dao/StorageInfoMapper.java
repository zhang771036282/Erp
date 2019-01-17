package com.erp.dao;

import com.erp.pojo.StorageInfo;
import com.erp.pojo.StorageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageInfoMapper {
    int countByExample(StorageInfoExample example);

    int deleteByExample(StorageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StorageInfo record);

    int insertSelective(StorageInfo record);

    List<StorageInfo> selectByExample(StorageInfoExample example);

    StorageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StorageInfo record, @Param("example") StorageInfoExample example);

    int updateByExample(@Param("record") StorageInfo record, @Param("example") StorageInfoExample example);

    int updateByPrimaryKeySelective(StorageInfo record);

    int updateByPrimaryKey(StorageInfo record);
}