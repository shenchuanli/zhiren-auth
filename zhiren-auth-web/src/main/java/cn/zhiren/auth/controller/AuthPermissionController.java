package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthPermission;
import cn.zhiren.auth.entity.AuthPermissionDataAuthRelationship;
import cn.zhiren.auth.service.IAuthPermissionDataAuthRelationshipService;
import cn.zhiren.auth.service.IAuthPermissionService;
import cn.zhiren.auth.service.Impl.AuthPermissionServiceImpl;
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
@RequestMapping("/authPermission")
public class AuthPermissionController extends BaseController<AuthPermissionServiceImpl,AuthPermission> {

}

