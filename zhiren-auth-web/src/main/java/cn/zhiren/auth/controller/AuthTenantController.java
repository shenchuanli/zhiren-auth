package cn.zhiren.auth.controller;


import cn.zhiren.auth.dto.CommonDTO.NameCodePageDTO;
import cn.zhiren.auth.entity.AuthTenant;
import cn.zhiren.auth.service.IAuthTenantService;
import cn.zhiren.auth.service.Impl.AuthTenantServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import cn.zhiren.core.DTO.BaseRespDTO;
import cn.zhiren.core.DTO.ResultStatus;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Api(value = "租户模块", description = "租户模块相关接口")
@RestController
@RequestMapping("/authTenant")
@Secured({"ROLE_AUTH_COMMON"})
public class AuthTenantController extends BaseController<IAuthTenantService,AuthTenant> {

    /**
     * 根据名称或编码查询租户
     * @param tenantName,pageIndex,PageSize
     * @return
     */
    @ApiOperation(value="租户信息", notes="根据名称或编码查询租户")
    @RequestMapping(value = "/api/getAuthTenant",method = RequestMethod.GET)
    public BaseRespDTO<Page<AuthTenant>> getAuthTenant(@RequestParam String tenantName,
                                                       @RequestParam Integer pageIndex,
                                                       @RequestParam Integer PageSize){
        System.out.println("用户信息：");
        System.out.println(getCurrentUserName());
        System.out.println(getCurrentTenantID());
        System.out.println(getCurrentUserID());
        EntityWrapper<AuthTenant> ew = new EntityWrapper<AuthTenant>();
        ew.where("TenantName={0}",tenantName);
        Page<AuthTenant> pg = new Page<>(pageIndex,PageSize);
        Page<AuthTenant> authTenantPage = service.selectPage(pg, ew);
        return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"ok",authTenantPage);
    }

    @ApiOperation(value="租户信息", notes="批量删除租户信息")
    @RequestMapping(value = "/api/deleteAuthTenants",method = RequestMethod.DELETE)
    public BaseRespDTO<Null> deleteAuthTenants(@RequestBody List<NameCodePageDTO> dto){
        EntityWrapper<AuthTenant> authTenantEntityWrapper = new EntityWrapper<>();
        Wrapper<AuthTenant> authTenantWrapper = authTenantEntityWrapper.where("1=0");

        for (NameCodePageDTO item:
                dto ) {
            authTenantWrapper.or("TenantID={0}",item.getId());
        }

        System.out.println(authTenantEntityWrapper.getSqlSegment());
        Boolean ret = service.delete(authTenantEntityWrapper);
        if(ret){
            return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"SUCCESS",null);
        }
        else{
            return new BaseRespDTO(ResultStatus.FAIL.getResultStatus(),"FAIL",null);
        }
    }
}

