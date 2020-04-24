package com.eoms.service;

import com.eoms.vo.SysOrgVo;

import java.util.List;

public interface SysOrgService {
    //返回role树状结构
    List<SysOrgVo> queryOrgTreeSelect();
    //通过org的主键id查询是否有子机构
    List<SysOrgVo> queryChildTree(String OrgId);
}
