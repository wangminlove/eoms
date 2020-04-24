package com.eoms.mapper;

import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysLoginErrorExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysLoginErrorMapper {
    long countByExample(SysLoginErrorExample example);

    int deleteByExample(SysLoginErrorExample example);

    int insert(SysLoginError record);

    int insertSelective(SysLoginError record);

    SysLoginError selectByPrimaryKey(String userId);

    List<SysLoginError> selectByExample(SysLoginErrorExample example);

    int updateByExampleSelective(@Param("record") SysLoginError record, @Param("example") SysLoginErrorExample example);

    int updateByExample(@Param("record") SysLoginError record, @Param("example") SysLoginErrorExample example);
}