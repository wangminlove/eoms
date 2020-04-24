package com.eoms.controller;

import com.eoms.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;
    //用户登录
    @RequestMapping("/roleList")
    @ResponseBody
    public List<Map<String, Object>> selectRoleList(){

        return sysRoleService.selectRoleList();
    }
}
