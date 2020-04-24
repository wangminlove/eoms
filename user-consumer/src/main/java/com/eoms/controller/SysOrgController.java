package com.eoms.controller;

import com.eoms.service.SysOrgFeignService;
import com.eoms.vo.SysOrgVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Api("Org控制器")
public class SysOrgController {
    @Autowired(required = false)
    private SysOrgFeignService sysOrgFeignService;

    @RequestMapping(value = "/org/queryOrgTreeSelect",method = RequestMethod.POST)
    public List<SysOrgVo> queryOrgTreeSelect(){
        return sysOrgFeignService.queryOrgTreeSelect();
    }
}
