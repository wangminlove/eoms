package com.eoms.service.impl;

import com.eoms.service.SysOrgService;
import com.eoms.vo.SysOrgVo;
import com.eoms.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysOrgServiceImpl implements SysOrgService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<SysOrgVo> queryOrgTreeSelect() {
        String sql = "select org_id as id, org_id as key, icon,org_name,description as title, org_order, description from sys_org where parent_id is null";
        RowMapper<SysOrgVo> rowMapper=new BeanPropertyRowMapper<SysOrgVo>(SysOrgVo.class);
        List<SysOrgVo> lists = jdbcTemplate.query(sql, rowMapper);
        if (lists.size()>0){
            for (SysOrgVo org:lists) {
                String id = org.getId();
                List<SysOrgVo> sysOrgVos = queryChildTree(id);
                if (sysOrgVos.size()>0){
                    org.setChildren(sysOrgVos);
                }
            }
        }

        return lists;
    }

    @Override
    public List<SysOrgVo> queryChildTree(String OrgId) {
        String sql = "select org_id as id, org_id as key,icon,org_name,description as title, org_order, description from sys_org where parent_id = ?";
        Object args[] = {OrgId};
        RowMapper<SysOrgVo> rowMapper=new BeanPropertyRowMapper<SysOrgVo>(SysOrgVo.class);
        List<SysOrgVo> lists = jdbcTemplate.query(sql, rowMapper,args);
        if (lists.size()>0){
            for (SysOrgVo org:lists) {
                String id = org.getId();
                List<SysOrgVo> sysOrgVos = queryChildTree(id);
                if (sysOrgVos.size()>0){
                    org.setChildren(sysOrgVos);
                }
            }
        }
        return lists;
    }
}
