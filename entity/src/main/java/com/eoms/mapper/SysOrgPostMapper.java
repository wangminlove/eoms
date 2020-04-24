package com.eoms.mapper;

import com.eoms.entity.SysOrgPost;
import com.eoms.entity.SysOrgPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrgPostMapper {
    long countByExample(SysOrgPostExample example);

    int deleteByExample(SysOrgPostExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysOrgPost record);

    int insertSelective(SysOrgPost record);

    List<SysOrgPost> selectByExample(SysOrgPostExample example);

    SysOrgPost selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysOrgPost record, @Param("example") SysOrgPostExample example);

    int updateByExample(@Param("record") SysOrgPost record, @Param("example") SysOrgPostExample example);

    int updateByPrimaryKeySelective(SysOrgPost record);

    int updateByPrimaryKey(SysOrgPost record);
}