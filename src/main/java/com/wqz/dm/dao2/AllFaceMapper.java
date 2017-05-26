package com.wqz.dm.dao2;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.wqz.dm.pojo2.AllFace;

@MapperScan
public interface AllFaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AllFace record);

    int insertSelective(AllFace record);

    AllFace selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AllFace record);

    int updateByPrimaryKey(AllFace record);
    
    List<Integer> selectAllId();

    List<AllFace> selectAll();
}