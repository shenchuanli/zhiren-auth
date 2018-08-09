package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthRole;
import cn.zhiren.auth.entity.AuthRolePermissionRelationship;
import cn.zhiren.auth.service.IAuthRolePermissionRelationshipService;
import cn.zhiren.auth.service.IAuthRoleService;
import cn.zhiren.auth.service.Impl.AuthRoleServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import io.swagger.annotations.Api;
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
@Api(value = "角色相关接口", description = "角色相关接口")
@RestController
@RequestMapping("/authRole")
public class AuthRoleController extends BaseController<IAuthRoleService,AuthRole> {

}

