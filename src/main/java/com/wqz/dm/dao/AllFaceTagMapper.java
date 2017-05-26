package com.wqz.dm.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.dm.pojo.AllFaceTag;

@MapperScan
public interface AllFaceTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AllFaceTag record);

    int insertSelective(AllFaceTag record);

    AllFaceTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AllFaceTag record);

    int updateByPrimaryKey(AllFaceTag record);

    List<Integer> selectAllId();
}