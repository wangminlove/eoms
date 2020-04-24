package com.eoms.service;

import com.eoms.entity.SysUsers;
import com.eoms.vo.SysOrgVo;
import com.eoms.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "user-provider")
public interface SysOrgFeignService {
    @RequestMapping(value = "/queryOrgTreeSelect",produces = "application/json;charset=UTF-8")  //必需强调是json才能转化为java对象
    public List<SysOrgVo> queryOrgTreeSelect();
}
