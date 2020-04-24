package com.eoms.service;

import com.eoms.entity.SysModule;

import java.util.List;

public interface SysModuleService {
    //路由接口
    List<SysModule> selectSysModule();
    //通过用户id查询菜单配置
    List<SysModule> selectSysMouduleByUserId(String userId);

}
