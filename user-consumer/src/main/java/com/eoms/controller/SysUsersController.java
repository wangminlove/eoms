package com.eoms.controller;

import com.eoms.entity.SysLoginError;
import com.eoms.entity.SysUsers;
import com.eoms.service.SysUsersFeignService;
import com.eoms.vo.UserVo;
import com.eoms.util.EncodeUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api("users控制器")
public class SysUsersController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired(required = false)
    private SysUsersFeignService sysUsersFeignService;

    private static final String REST_URL_PREFIX = "http://user-provider/";



   //校验用户名是否存在
    public SysUsers checkName(SysUsers sysUsers){
       // SysUsers users = restTemplate.postForObject(REST_URL_PREFIX + "checkName", sysUsers, SysUsers.class);
        SysUsers users = sysUsersFeignService.checkName(sysUsers);
        return users;
    }

    //修改最后一次登录时间
    public void updateLoginTime(SysUsers sysUsers){
        Integer result = sysUsersFeignService.updateLoginTime(sysUsers);
        //Integer result =  restTemplate.postForObject(REST_URL_PREFIX+"updateLoginTime",sysUsers,Integer.class);
    }

    //密码5次输入不正确时修改用户locked值
    public void updateLocked(SysUsers sysUsers){
        Integer result = sysUsersFeignService.updateLocked(sysUsers);
       // Integer result =  restTemplate.postForObject(REST_URL_PREFIX+"updateLocked",sysUsers,Integer.class);
    }
    //删除Sys_login_error表中该用户记录
    public void deleteLoginError(SysLoginError loginError){
        Integer result = sysUsersFeignService.deleteLoginError(loginError);
        // Integer result =  restTemplate.postForObject(REST_URL_PREFIX+"deleteLoginError",loginError,Integer.class);
    }
    //查询登陆用户是否有登陆失败记录
    public SysLoginError checkLoginError(SysUsers sysUsers){
       // SysLoginError loginError = restTemplate.postForObject(REST_URL_PREFIX + "checkLoginError", sysUsers, SysLoginError.class);
        SysLoginError loginError = sysUsersFeignService.checkLoginError(sysUsers);
        return loginError;
    }

    //在sys_login_erro表中新增一条登陆错误数据
    public void insertLoginError(SysUsers sysUsers){
        Integer result = sysUsersFeignService.insertLoginError(sysUsers);
        // Integer result =  restTemplate.postForObject(REST_URL_PREFIX+"insertLoginError",sysUsers,Integer.class);
    }
    //在sys_login_erro表修改isValid值
    public void updateLoginError(SysLoginError loginError){
       // Integer result =  restTemplate.postForObject(REST_URL_PREFIX+"updateLoginError",loginError,Integer.class);
        Integer result = sysUsersFeignService.updateLoginError(loginError);
    }

    //通过用户id查询用户信息
    @ApiOperation(value = "查询单个用户", notes = "单个用户查询接口")
    @RequestMapping(value = "/user/getUserInfoById")
    public Map<String, Object> selectUserByUserId(String userid){
        SysUsers sysUsers = new SysUsers();
        sysUsers.setId(userid);
        List<UserVo> list = sysUsersFeignService.selectUserByUserId(sysUsers);
        // List<UserVo>list = restTemplate.postForObject(REST_URL_PREFIX + "selectuser", sysUsers, List.class);
        Map<String,Object>map = new HashMap<>();
        if (list.size()==1){
            map.put("data",list);
            map.put("status","200");
            map.put("message","success");
        }else{
            map.put("status","401");
            map.put("message","未查到用户信息！");
        }
        return map;
    }

    //查询所有用户信息
    @ApiOperation(value = "获取所有用户", notes = "所有用户查询接口")
    @RequestMapping(value = "/user/userList")
    public Map<String, Object> selectUserList(){
       // List<Map<String, Object>>list = restTemplate.getForObject(REST_URL_PREFIX+"userList", List.class);
        List<Map<String,Object>> list = sysUsersFeignService.selectUserList();
        Map<String,Object>map = new HashMap<>();
        if (list.size()>0){
            map.put("data",list);
            map.put("status","200");
            map.put("message","success");
        }else{
            map.put("status","401");
            map.put("message","未查到用户信息！");
        }
        return map;
    }

    //获取所有角色信息
    @ApiOperation(value = "获取所有角色", notes = "所有角色信息查询接口")
    @RequestMapping(value = "/role/roleList")
    public List<Map<String, Object>> selectRoleList(){
        List<Map<String, Object>>list = restTemplate.getForObject(REST_URL_PREFIX+"roleList", List.class);
        return list;
    }
    //通过用户id查询用户信息
    @ApiOperation(value = "查询单个用户", notes = "单个用户查询接口")
    @RequestMapping(value = "/user/info")
    public Map<String, Object> selectUser(){
        UserVo userVo = new UserVo();
        userVo.setToken("123456789");
        userVo.setUserId("1000");
        userVo.setCenterName("开发中心");
        userVo.setDeptName("研发部");
        userVo.setDeptName("普通员工");
        userVo.setPostName("开发工程师");
        userVo.setUserName("大熊");
        List<UserVo> list =new ArrayList<>();
        list.add(userVo);
        Map<String,Object>map = new HashMap<>();
        map.put("data",list);
        map.put("status","200");
        map.put("message","success");
        return map;
    }


    @ApiOperation(value = "用户登录", notes = "登录接口")
    @RequestMapping(value = "/auth/login")
    public Map<String, Object> login(String loginname,String psw){
        Map<String,Object>map = new HashMap<>();
        //校验用户名和密码是否为空
        if (loginname==null||loginname.equals("")){
            map.put("status","401");
            map.put("message","用户名或密码错误！");
            return map;
        }
        if ((psw + "==").equals(EncodeUtils.md5("")) || (psw + "==").equals(EncodeUtils.md5("0"))){
            map.put("status","401");
            map.put("message","用户名或密码错误！");
            return map;
        }
        SysUsers sysUsers = new SysUsers();
        sysUsers.setLoginname(loginname);
        sysUsers.setPsw(psw + "==");
        //校验用户名是否存在，当存在时返回该用户
        SysUsers users = checkName(sysUsers);

        //查询登陆用户是否有登陆失败记录
        SysLoginError loginError = null;
        if (users==null){
            map.put("status","401");
            map.put("message","用户名不存在，请重新输入！");
            return map;
        }else {
            //数据库中该用户名持有的密文密码
            String Psw = users.getPsw();
            if (users.getLocked().equals("1")){
                map.put("status","401");
                map.put("message","该用户已被锁定，请联系网管！");
                return map;
            }
            //当该用户存在时比较密码是否正确
            if (!Psw.equals(psw+"==")){
                loginError = checkLoginError(users);
                //当用户第一次登陆失败，在sys_login_error表添加一条数据，记录登陆次数
                if (loginError==null){
                    //当loginError为null，说明是第一次密码输入错误，在sys_login_erro表中新增一条错误数据
                    insertLoginError(users);
                }else if (loginError!=null){

                    int isValid = Integer.parseInt(loginError.getIsValid());
                    if (isValid<4){
                        //当isValid<4时在sys_login_erro表修改isValid值+1
                        isValid++;
                        loginError.setIsValid(isValid+"");
                        updateLoginError(loginError);
                    }else if (isValid==4){
                        //当isValid>5时,锁定该用户,修改sys_users的locked值改为1，并删除Sys_login_error表中该用户记录
                        updateLocked(users);
                        deleteLoginError(loginError);
                        map.put("status","401");
                        map.put("message","5次密码输入不正确，用户已锁定！");
                        return map;
                    }
                }
                map.put("status","401");
                map.put("message","密码输入不正确，请重试！");
                return map;
            }
        }
        //List<UserVo>list = restTemplate.postForObject(REST_URL_PREFIX + "login", sysUsers, List.class);
        List<UserVo> list = sysUsersFeignService.login(sysUsers);
        if (list.size()==1){
            //登录成功并修改最后一次登录时间
            updateLoginTime(users);
            loginError = checkLoginError(users);
            //删除登录错误记录
            if (loginError!=null) {
                deleteLoginError(loginError);
            }
            map.put("data",list);
            map.put("status","200");
            map.put("message","success");
        }else if (list.size()==0){
            map.put("status","401");
            map.put("message","用户已被锁定！");
        }
        return map;
    }

}
