package com.eoms.service;

import java.util.List;
import java.util.Map;

public interface SysRoleService {
    //查询所有角色信息
    List<Map<String, Object>> selectRoleList();

}
