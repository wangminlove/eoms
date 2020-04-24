package com.eoms.service.impl;

import com.eoms.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> selectRoleList() {
        String sql = "select role_id as roleId, role_name as roleName, role_code as roleCode, desciption, create_date as createDate from sys_role";
        List<Map<String, Object>> lists = jdbcTemplate.queryForList(sql);
        return lists;
    }
}
