package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthUserRoleRelationship;
import cn.zhiren.auth.entity.DataAuth;
import cn.zhiren.auth.service.IAuthUserRoleRelationshipService;
import cn.zhiren.auth.service.IDataAuthService;
import cn.zhiren.auth.service.Impl.AuthUserRoleRelationshipServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Api(value = "用户角色关系", description = "用户角色关系相关接口")
@Controller
@RequestMapping("/authUserRoleRelationship")
public class AuthUserRoleRelationshipController extends BaseController<AuthUserRoleRelationshipServiceImpl,AuthUserRoleRelationship> {

}

