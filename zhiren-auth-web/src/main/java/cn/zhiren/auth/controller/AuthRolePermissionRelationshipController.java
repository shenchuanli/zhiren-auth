package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthRolePermissionRelationship;
import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.service.IAuthRolePermissionRelationshipService;
import cn.zhiren.auth.service.IAuthUserService;
import cn.zhiren.auth.service.Impl.AuthRolePermissionRelationshipServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@RestController
@RequestMapping("/authRolePermissionRelationship")
public class AuthRolePermissionRelationshipController extends BaseController<AuthRolePermissionRelationshipServiceImpl,AuthRolePermissionRelationship> {

}
