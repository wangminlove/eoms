package com.eoms.service;

import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysUsers;
import com.eoms.vo.SysUsersVo;
import com.eoms.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface SysUsersService {
    //用户登录
    List<UserVo> login(SysUsers sysUsers);
    //校验用户名密码是否正确
    SysUsers checkName(String loginname);
    //修改最后一次登录时间
    Integer updateLoginTime(SysUsers sysUsers);
    //查询用户是否有登陆失败记录
    public SysLoginError checkLoginError(SysUsers sysUsers);
    //新增登陆错误数据
    Integer insertLoginError(SysUsers sysUsers);
    //在sys_login_erro表修改isValid值
    Integer updateLoginError(SysLoginError loginError);
    //密码5次输入不正确时修改用户locked值
    Integer updateLocked(SysUsers sysUsers);
    //删除Sys_login_error表中该用户记录
    Integer deleteLoginError(SysLoginError loginError);
    //查询单个用户信息
    List<UserVo> selectUserByUserId(String userid);
    //查询所有用户信息
    List<UserVo> selectUserList();
}
