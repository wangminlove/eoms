package com.eoms.service.impl;


import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysUsers;
import com.eoms.entity.SysUsersExample;
import com.eoms.mapper.SysLoginErrorMapper;
import com.eoms.mapper.SysUsersMapper;
import com.eoms.service.SysUsersService;
import com.eoms.util.DateUtils;
import com.eoms.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SysUsersServiceImpl implements SysUsersService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired(required = false)
    private SysUsersMapper sysUsersMapper;

    @Autowired(required = false)
    private SysLoginErrorMapper sysLoginErrorMapper;

    @Override
    public List<UserVo> login(SysUsers sysUsers) {
        String sql = "select us.id as userId,us.username, sr.role_name as roleName," +
                "so.org_name as centerName, sor.org_name as deptName ," +
                "sp.post_name as postName " +
                "from sys_users us " +
                "inner join sys_org so on us.dept_id = so.org_id " +
                "inner join sys_org sor on us.centre_id= sor.org_id " +
                "inner join sys_user_role sur on  us.id= sur.user_id " +
                "inner join sys_role sr on sr.role_id= sur.role_id " +
                "inner JOIN sys_post sp on us.post_id= sp.post_id " +
                "where us.loginname = ? and us.psw= ? and us.locked = '0'";
        Object args[] = {sysUsers.getLoginname(),sysUsers.getPsw()};
        RowMapper<UserVo> rowMapper=new BeanPropertyRowMapper<UserVo>(UserVo.class);
        List<UserVo> list = jdbcTemplate.query(sql, rowMapper, args);
        return list;
    }
    //校验用户是否存在
    @Override
    public SysUsers checkName(String loginname) {
        SysUsersExample sysUsersExample=new SysUsersExample();
        SysUsersExample.Criteria criteria = sysUsersExample.createCriteria();
        criteria.andLoginnameEqualTo(loginname);
        criteria.andDeletedEqualTo("0");
        List<SysUsers> list = sysUsersMapper.selectByExample(sysUsersExample);
        if (list.size()==1) {
            return list.get(0);
        } else {
            return null;
        }
    }
    //修改最后一次登录时间
    @Override
    public Integer updateLoginTime(SysUsers sysUsers) {
        Date date = new Date();
        String lastLoginDate = DateUtils.DateTimeStr(date);
        sysUsers.setLastLoginDate(lastLoginDate);
        Integer result = sysUsersMapper.updateByPrimaryKey(sysUsers);
        return result;
    }
    //查询用户是否有登陆失败记录
    @Override
    public SysLoginError checkLoginError(SysUsers sysUsers) {
        SysLoginError loginError = sysLoginErrorMapper.selectByPrimaryKey(sysUsers.getId());
        return loginError;
    }
    //新增登陆错误数据
    @Override
    public Integer insertLoginError(SysUsers sysUsers) {
        SysLoginError loginError = new SysLoginError();
        loginError.setUserId(sysUsers.getId());
        loginError.setErrorDesc("密码输入错误");
        loginError.setIsValid("1");
        loginError.setErrorDate(DateUtils.DateTimeStr(new Date()));
        String sql = "insert into sys_login_error (user_id,ERROR_DESC,ERROR_DATE,IS_VALID) values (?,?,?,?)";
        Object args[] = {loginError.getUserId(),loginError.getErrorDesc(),loginError.getErrorDate(),loginError.getIsValid()};
        Integer result = jdbcTemplate.update(sql, args);
        return result;
    }
    //在sys_login_erro表修改isValid值
    @Override
    public Integer updateLoginError(SysLoginError loginError) {
        String sql = "update sys_login_error set is_valid = ? where user_id = ?";
        Object args[] = {loginError.getIsValid(),loginError.getUserId()};
        return jdbcTemplate.update(sql, args);
    }
    //密码5次输入不正确时修改用户locked值
    @Override
    public Integer updateLocked(SysUsers sysUsers) {
        sysUsers.setLocked("1");
        return sysUsersMapper.updateByPrimaryKey(sysUsers);
    }
    //删除Sys_login_error表中该用户记录
    @Override
    public Integer deleteLoginError(SysLoginError loginError) {
        String sql = "delete from sys_login_error where user_id = ?";
        Object args[] = {loginError.getUserId()};
        return jdbcTemplate.update(sql, args);
    }
    //查询单个用户信息
    @Override
    public List<UserVo> selectUserByUserId(String userid) {
        String sql = "select us.id as userId,us.username, sr.role_name as roleName," +
                "so.org_name as centerName, sor.org_name as deptName ," +
                "sp.post_name as postName " +
                "from sys_users us " +
                "inner join sys_org so on us.dept_id = so.org_id " +
                "inner join sys_org sor on us.centre_id= sor.org_id " +
                "inner join sys_user_role sur on  us.id= sur.user_id " +
                "inner join sys_role sr on sr.role_id= sur.role_id " +
                "inner JOIN sys_post sp on us.post_id= sp.post_id " +
                "where us.id = ? ";
        Object args[] = {userid};
        RowMapper<UserVo> rowMapper=new BeanPropertyRowMapper<UserVo>(UserVo.class);
        List<UserVo> list = jdbcTemplate.query(sql, rowMapper, args);
        return list;
    }

    @Override
    public List<UserVo> selectUserList() {
        String sql = "select us.id as userId,us.username as userName,us.sex,us.identity_num as identityNum," +
                "us.birthday,us.enter_date as enterDate,us.employe_status as employeStatus,us.user_no as userNo," +
                "us.user_hr_no as userHrNo," +
                "sr.role_name as roleName,so.org_name as centerName," +
                "sor.org_name as deptName ,sp.post_name as postName " +
                "from sys_users us inner join sys_org so on us.dept_id = so.org_id " +
                "inner join sys_org sor on us.centre_id= sor.org_id " +
                "inner join sys_user_role sur on  us.id= sur.user_id " +
                "inner join sys_role sr on sr.role_id= sur.role_id " +
                "inner JOIN sys_post sp on us.post_id= sp.post_id ";
        RowMapper<UserVo> rowMapper=new BeanPropertyRowMapper<UserVo>(UserVo.class);
        List<UserVo> lists = jdbcTemplate.query(sql, rowMapper);
        return lists;
    }
}
