package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthPermission;
import cn.zhiren.auth.entity.AuthPermissionAPIRelationship;
import cn.zhiren.auth.service.IAuthPermissionAPIRelationshipService;
import cn.zhiren.auth.service.IAuthPermissionService;
import cn.zhiren.auth.service.Impl.AuthPermissionAPIRelationshipServiceImpl;
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
@RequestMapping("/authPermissionAPIRelationship")
public class AuthPermissionAPIRelationshipController extends BaseController<AuthPermissionAPIRelationshipServiceImpl,AuthPermissionAPIRelationship> {

}

