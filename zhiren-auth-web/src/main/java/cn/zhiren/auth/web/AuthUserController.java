package cn.zhiren.auth.web;

import cn.zhiren.auth.dto.AuthUserManager.AuthUserDTO;
import cn.zhiren.auth.dto.AuthUserManager.AuthUserQueryParameterDTO;
import cn.zhiren.auth.service.AuthUserManagerService;
import cn.zhiren.core.DTO.BaseRespDTO;
import cn.zhiren.core.DTO.ResultStatus;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
@Api(value = "测试", description = "仅仅用于测试")
@RestController
@Secured({"ROLE_AUTH_USER_ROLE"})
public class AuthUserController {

    @Autowired
    AuthUserManagerService authUserManagerService;

    @ApiOperation(value="根据名称获得用户信息", notes="根据url的name来获取用户详细信息")
    @RequestMapping(value = "/api/getPageAuthUser",method = RequestMethod.POST)
    public CompletableFuture<BaseRespDTO<PageInfo<AuthUserDTO>>> getPageAuthUser(@RequestBody AuthUserQueryParameterDTO authUserQueryParameterDTO){
        return  CompletableFuture.supplyAsync(()->{
            PageInfo<AuthUserDTO> authUserDTOS = authUserManagerService.getAuthUserPage(authUserQueryParameterDTO);
            return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"ok", authUserDTOS);
        });
    }
}
