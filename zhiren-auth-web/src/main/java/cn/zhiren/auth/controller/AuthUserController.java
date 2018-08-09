package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.entity.AuthUserRoleRelationship;
import cn.zhiren.auth.service.IAuthUserRoleRelationshipService;
import cn.zhiren.auth.service.IAuthUserService;
import cn.zhiren.auth.service.Impl.AuthUserServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import cn.zhiren.core.DTO.BaseRespDTO;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Api(value = "用户模块", description = "用户模块相关接口")
@RestController
@RequestMapping("/authUser")
public class AuthUserController extends BaseController<IAuthUserService,AuthUser> {

//    public BaseRespDTO<AuthUser> getAuthUser(){
//
//    }
}
