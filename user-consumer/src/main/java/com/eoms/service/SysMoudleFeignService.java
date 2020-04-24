package com.eoms.service;

import com.eoms.Hystrix.MoudelFeignFallbackFactory;
import com.eoms.entity.SysModule;
import com.eoms.vo.SysModuleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value = "user-provider",fallback = MoudelFeignFallbackFactory.class)
public interface SysMoudleFeignService {
    @RequestMapping(value = "/nav",produces = "application/json;charset=UTF-8")  //必需强调是json才能转化为java对象
    public List<Map<String,Object>> selectSysModule();
    //根据用户id查询菜单配置
    @RequestMapping(value = "/queryModuleByOrgId",produces = "application/json;charset=UTF-8")  //必需强调是json才能转化为java对象
    public List<Map<String,Object>> selectSysModuleByUserId(SysModule sysModule);
}
