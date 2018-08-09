package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthGroup;
import cn.zhiren.auth.entity.AuthGroupRoleRelationship;
import cn.zhiren.auth.service.IAuthGroupRoleRelationshipService;
import cn.zhiren.auth.service.IAuthGroupService;
import cn.zhiren.auth.service.Impl.AuthGroupServiceImpl;
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
@Api(value = "用户组相关接口", description = "用户组相关接口")
@RestController
@RequestMapping("/authGroup")
public class AuthGroupController extends BaseController<IAuthGroupService,AuthGroup> {

}

