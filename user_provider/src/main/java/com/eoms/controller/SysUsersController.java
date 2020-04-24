package com.eoms.controller;

import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysUsers;
import com.eoms.service.SysUsersService;
import com.eoms.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SysUsersController {
    @Autowired
    private SysUsersService sysUsersService;
    //用户登录
    @RequestMapping("/login")
    @ResponseBody
    public List<UserVo> login(@RequestBody SysUsers sysUsers){
        List<UserVo> userVos = sysUsersService.login(sysUsers);
        if (userVos.size()==1){
            userVos.get(0).setToken("123456789");
        }
        return userVos;
    }
    //查询数据表中是否有该用户
    @RequestMapping("/checkName")
    @ResponseBody
    public SysUsers checkName(@RequestBody SysUsers sysUsers){
       return sysUsersService.checkName(sysUsers.getLoginname());
    }
    //修改用户最后一次登陆时间
    @RequestMapping("/updateLoginTime")
    @ResponseBody
    public Integer updateLoginTime(@RequestBody SysUsers sysUsers){
        Integer result = sysUsersService.updateLoginTime(sysUsers);
        return result;
    }
    //查询该用户之前是否有错误登陆记录
    @RequestMapping("/checkLoginError")
    @ResponseBody
    public SysLoginError checkLoginError(@RequestBody SysUsers sysUsers){
        return sysUsersService.checkLoginError(sysUsers);
    }
    //新增一条错误登陆记录
    @RequestMapping("/insertLoginError")
    @ResponseBody
    public Integer insertLoginError(@RequestBody SysUsers sysUsers){
        return sysUsersService.insertLoginError(sysUsers);
    }
    //在sys_login_erro表修改isValid值
    @RequestMapping("/updateLoginError")
    @ResponseBody
    Integer updateLoginError(@RequestBody SysLoginError loginError){
        return sysUsersService.updateLoginError(loginError);
    }
    //密码5次输入不正确时修改用户locked值
    @RequestMapping("/updateLocked")
    @ResponseBody
    public Integer updateLocked(@RequestBody SysUsers sysUsers){
        return sysUsersService.updateLocked(sysUsers);
    }
    //删除Sys_login_error表中该用户记录
    @RequestMapping("/deleteLoginError")
    @ResponseBody
    public Integer deleteLoginError(@RequestBody SysLoginError loginError){
        return sysUsersService.deleteLoginError(loginError);
    }
    //查询单个用户信息
    @RequestMapping("/selectuser")
    @ResponseBody
    public List<UserVo> selectUserByUserId(@RequestBody SysUsers sysUsers){
        List<UserVo> userVos = sysUsersService.selectUserByUserId(sysUsers.getId());
        return userVos;
    }
    //查询所有用户信息
    @RequestMapping("/userList")
    @ResponseBody
    public List<UserVo> selectUserList(){
        return sysUsersService.selectUserList();
    }

}
