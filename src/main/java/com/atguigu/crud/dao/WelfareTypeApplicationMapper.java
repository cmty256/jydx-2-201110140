package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.WelfareTypeApplication;
import com.atguigu.crud.bean.WelfareTypeApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WelfareTypeApplicationMapper {
    long countByExample(WelfareTypeApplicationExample example);

    int deleteByExample(WelfareTypeApplicationExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(WelfareTypeApplication row);

    int insertSelective(WelfareTypeApplication row);

    List<WelfareTypeApplication> selectByExample(WelfareTypeApplicationExample example);

    WelfareTypeApplication selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("row") WelfareTypeApplication row, @Param("example") WelfareTypeApplicationExample example);

    int updateByExample(@Param("row") WelfareTypeApplication row, @Param("example") WelfareTypeApplicationExample example);

    int updateByPrimaryKeySelective(WelfareTypeApplication row);

    int updateByPrimaryKey(WelfareTypeApplication row);

}