package com.eoms.Hystrix;

import com.eoms.entity.SysModule;
import com.eoms.service.SysMoudleFeignService;
import com.eoms.vo.SysModuleVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MoudelFeignFallbackFactory implements SysMoudleFeignService {

    @Override
    public List<Map<String,Object>> selectSysModule() {
        List<Map<String, Object>>list = new ArrayList<>();
        Map<String,Object>map=new HashMap<>();
        map.put("message","服务器异常，请稍后再尝试！");
        list.add(map);

//        List<SysModuleVo>list = new ArrayList<>();
//        SysModuleVo sysModuleVo = new SysModuleVo();
//        sysModuleVo.setName("服务器异常，请稍后再尝试！");
//        list.add(sysModuleVo);
        return list;
    }

    @Override
    public List<Map<String, Object>> selectSysModuleByUserId(SysModule sysModule) {
        List<Map<String, Object>>list = new ArrayList<>();
        Map<String,Object>map=new HashMap<>();
        map.put("message","服务器异常，请稍后再尝试！");
        list.add(map);
        return list;
    }


}
