package com.atguigu.crud.dao;

import com.atguigu.crud.bean.WelfareType;
import com.atguigu.crud.bean.WelfareTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WelfareTypeMapper {
    long countByExample(WelfareTypeExample example);

    int deleteByExample(WelfareTypeExample example);

    int deleteByPrimaryKey(Integer welfareTypeId);

    int insert(WelfareType row);

    int insertSelective(WelfareType row);

    List<WelfareType> selectByExample(WelfareTypeExample example);

    WelfareType selectByPrimaryKey(Integer welfareTypeId);

    int updateByExampleSelective(@Param("row") WelfareType row, @Param("example") WelfareTypeExample example);

    int updateByExample(@Param("row") WelfareType row, @Param("example") WelfareTypeExample example);

    int updateByPrimaryKeySelective(WelfareType row);

    int updateByPrimaryKey(WelfareType row);
}