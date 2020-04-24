package com.eoms.controller;

import com.eoms.entity.SysModule;
import com.eoms.service.SysModuleService;
import com.eoms.service.SysMoudleFeignService;
import com.eoms.vo.SysModuleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api("users控制器")
public class SysModuleController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired(required = false)
    private SysMoudleFeignService sysMoudleFeignService;

    private static final String REST_URL_PREFIX = "http://user-provider/";
    /*
        @ApiOperation(value = "菜单路由", notes = "路由查询后端接口")
        @RequestMapping(value = "/users/nav",method = RequestMethod.POST)
        public Map<String, Object> selectSysModule(){
            List<Map<String, Object>> list = restTemplate.getForObject(REST_URL_PREFIX+"nav", List.class);
            Map<String,Object>map=new HashMap<>();
            if (list.size()>0){
                map.put("result",list);
            }
            return map;
        }*/
    @RequestMapping(value = "/users/nav",method = RequestMethod.POST)
    public Map<String, Object> selectSysModule(){
//        List<SysModuleVo>lists = restTemplate.getForObject(REST_URL_PREFIX + "nav", List.class);
//        System.out.println(lists);
        List<Map<String,Object>> list = sysMoudleFeignService.selectSysModule();
        Map<String,Object>map=new HashMap<>();
        if (list.size()>0){
            map.put("result",list);
        }
        return map;
    }
    //根据用户id查询菜单配置
    @RequestMapping(value = "/module/queryModuleByOrgId",method = RequestMethod.POST)
    public Map<String, Object> selectSysModuleByOrgId(String userId){
        SysModule sysModule = new SysModule();
        sysModule.setId(userId);
        List<Map<String,Object>> list = sysMoudleFeignService.selectSysModuleByUserId(sysModule);
        Map<String,Object>map=new HashMap<>();
        if (list.size()>0){
            map.put("result",list);
        }
        return map;
    }
}
