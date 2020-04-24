package com.eoms.service.impl;


import com.eoms.entity.SysModule;
import com.eoms.mapper.SysModuleMapper;
import com.eoms.service.SysModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysModuleServiceImpl implements SysModuleService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired(required = false)
    private SysModuleMapper sysModuleMapper;
    /**
     * @return
     * 查询全部SysModule信息
     */
    @Override
    public List<SysModule> selectSysModule() {
        return sysModuleMapper.selectByExample(null);
    }
    //根据用户id查询菜单配置
    @Override
    public List<SysModule> selectSysMouduleByUserId(String userId) {
        String sql = "select sm.* from sys_users us " +
                "inner join sys_user_role ur on us.id = ur.user_id " +
                "inner join sys_role sr on ur.role_id = sr.role_id " +
                "inner join sys_role_module srm on sr.role_id = srm.role_id " +
                "inner join sys_module sm on srm.module_id = sm.id where us.id = ?";
        Object args[] = {userId};
        RowMapper<SysModule> rowMapper=new BeanPropertyRowMapper<SysModule>(SysModule.class);
        List<SysModule> list = jdbcTemplate.query(sql, rowMapper, args);
        return list;

    }
}
