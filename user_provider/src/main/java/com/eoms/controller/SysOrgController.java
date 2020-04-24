package com.eoms.controller;

import com.eoms.service.SysOrgService;
import com.eoms.vo.SysOrgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SysOrgController {
    @Autowired
    private SysOrgService sysOrgService;

    @RequestMapping("/queryOrgTreeSelect")
    @ResponseBody
    public List<SysOrgVo> queryOrgTreeSelect(){
        List<SysOrgVo> sysOrgVos = sysOrgService.queryOrgTreeSelect();
        return sysOrgVos;
    }
}
