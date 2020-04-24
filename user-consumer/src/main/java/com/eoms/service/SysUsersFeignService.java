package com.eoms.service;

import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysUsers;
import com.eoms.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@FeignClient(value = "user-provider")
public interface SysUsersFeignService {
    @RequestMapping(value = "/login",produces = "application/json;charset=UTF-8")  //必需强调是json才能转化为java对象
    public List<UserVo> login(@RequestBody SysUsers sysUsers);

    //查询数据表中是否有该用户
    @RequestMapping(value = "/checkName",produces = "application/json;charset=UTF-8")
    public SysUsers checkName(@RequestBody SysUsers sysUsers);

    //修改用户最后一次登陆时间
    @RequestMapping(value = "/updateLoginTime",produces = "application/json;charset=UTF-8")
    public Integer updateLoginTime(@RequestBody SysUsers sysUsers);

    //查询该用户之前是否有错误登陆记录
    @RequestMapping(value = "/checkLoginError",produces = "application/json;charset=UTF-8")
    public SysLoginError checkLoginError(@RequestBody SysUsers sysUsers);

    //新增一条错误登陆记录
    @RequestMapping(value = "/insertLoginError",produces = "application/json;charset=UTF-8")
    public Integer insertLoginError(@RequestBody SysUsers sysUsers);

    //在sys_login_erro表修改isValid值
    @RequestMapping(value = "/updateLoginError",produces = "application/json;charset=UTF-8")
    Integer updateLoginError(@RequestBody SysLoginError loginError);

    //密码5次输入不正确时修改用户locked值
    @RequestMapping(value = "/updateLocked",produces = "application/json;charset=UTF-8")
    public Integer updateLocked(@RequestBody SysUsers sysUsers);

    //删除Sys_login_error表中该用户记录
    @RequestMapping(value = "/deleteLoginError",produces = "application/json;charset=UTF-8")
    public Integer deleteLoginError(@RequestBody SysLoginError loginError);

    //查询单个用户信息
    @RequestMapping(value = "/selectuser",produces = "application/json;charset=UTF-8")
    public List<UserVo> selectUserByUserId(@RequestBody SysUsers sysUsers);

    //查询所有用户信息
    @RequestMapping(value = "/userList",produces = "application/json;charset=UTF-8")
    public List<Map<String,Object>> selectUserList();
}
