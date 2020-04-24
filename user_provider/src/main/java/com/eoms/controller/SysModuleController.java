package com.eoms.controller;

import com.eoms.entity.SysModule;
import com.eoms.entity.SysUsers;
import com.eoms.service.SysModuleService;
import com.eoms.vo.Module;
import com.eoms.vo.SysModuleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SysModuleController {

    @Autowired
    private SysModuleService sysModuleService;

    @RequestMapping("/nav")
    @ResponseBody
    public List<SysModuleVo> selectSysModule(){
        //获取所有数据
        List<SysModule> list = sysModuleService.selectSysModule();
        List<SysModuleVo>SysModuleVoList = new ArrayList<>();
        List<Module>ModuleList=new ArrayList<>();
        if (list.size()>0){
            for (SysModule sysModule :list) {
                //组装meta中的数据
                Module module=new Module();
                if (sysModule.getMetaIcon()!=null && !sysModule.getMetaIcon().equals("")){
                    module.setIcon(sysModule.getMetaIcon());
                }
                if (sysModule.getMetaTitle()!=null && !sysModule.getMetaTitle().equals("")){
                    module.setTitle(sysModule.getMetaTitle());
                }
                if (sysModule.getMetaShow()!=null && !sysModule.getMetaShow().equals("")){
                    module.setShow(sysModule.getMetaShow());
                }
                if (sysModule.getMetaHidechildren()!=null && !sysModule.getMetaHidechildren().equals("")){
                    module.setHidechildren(sysModule.getMetaHidechildren());
                }
                if (sysModule.getMetaHideheader()!=null && !sysModule.getMetaHideheader().equals("")){
                    module.setHideheader(sysModule.getMetaHideheader());
                }
                if (sysModule.getMetaHiddenheadercontent()!=null && !sysModule.getMetaHiddenheadercontent().equals("")){
                    module.setMetaHiddenheadercontent(sysModule.getMetaHiddenheadercontent());
                }
                //将组装好的meta对象及sysModule中数据放到sysModuleVo中，并存放到list集合返回
                SysModuleVo sysModuleVo=new SysModuleVo();
                sysModuleVo.setMeta(module);
                sysModuleVo.setComponent(sysModule.getComponent());
                sysModuleVo.setId(sysModule.getId());
                sysModuleVo.setModuleLevel(sysModule.getModuleLevel());
                sysModuleVo.setModuleOrder(sysModule.getModuleOrder());
                sysModuleVo.setName(sysModule.getName());
                sysModuleVo.setParentId(sysModule.getParentid());
                sysModuleVo.setRedirect(sysModule.getRedirect());
                SysModuleVoList.add(sysModuleVo);
            }
        }
        return SysModuleVoList;
    }
    //根据用户id查询菜单配置
    @RequestMapping("/queryModuleByOrgId")
    @ResponseBody
    public List<SysModuleVo> selectSysModuleByUserId(@RequestBody SysUsers sysUsers){
        String userId = sysUsers.getId();
        List<SysModule> list = sysModuleService.selectSysMouduleByUserId(userId);
        List<SysModuleVo>SysModuleVoList = new ArrayList<>();
        List<Module>ModuleList=new ArrayList<>();
        if (list.size()>0){
            for (SysModule sysModule :list) {
                //组装meta中的数据
                Module module=new Module();
                if (sysModule.getMetaIcon()!=null && !sysModule.getMetaIcon().equals("")){
                    module.setIcon(sysModule.getMetaIcon());
                }
                if (sysModule.getMetaTitle()!=null && !sysModule.getMetaTitle().equals("")){
                    module.setTitle(sysModule.getMetaTitle());
                }
                if (sysModule.getMetaShow()!=null && !sysModule.getMetaShow().equals("")){
                    module.setShow(sysModule.getMetaShow());
                }
                if (sysModule.getMetaHidechildren()!=null && !sysModule.getMetaHidechildren().equals("")){
                    module.setHidechildren(sysModule.getMetaHidechildren());
                }
                if (sysModule.getMetaHideheader()!=null && !sysModule.getMetaHideheader().equals("")){
                    module.setHideheader(sysModule.getMetaHideheader());
                }
                if (sysModule.getMetaHiddenheadercontent()!=null && !sysModule.getMetaHiddenheadercontent().equals("")){
                    module.setMetaHiddenheadercontent(sysModule.getMetaHiddenheadercontent());
                }
                //将组装好的meta对象及sysModule中数据放到sysModuleVo中，并存放到list集合返回
                SysModuleVo sysModuleVo=new SysModuleVo();
                sysModuleVo.setMeta(module);
                sysModuleVo.setComponent(sysModule.getComponent());
                sysModuleVo.setId(sysModule.getId());
                sysModuleVo.setModuleLevel(sysModule.getModuleLevel());
                sysModuleVo.setModuleOrder(sysModule.getModuleOrder());
                sysModuleVo.setName(sysModule.getName());
                sysModuleVo.setParentId(sysModule.getParentid());
                sysModuleVo.setRedirect(sysModule.getRedirect());
                SysModuleVoList.add(sysModuleVo);
            }
        }
        return SysModuleVoList;
    }
}
