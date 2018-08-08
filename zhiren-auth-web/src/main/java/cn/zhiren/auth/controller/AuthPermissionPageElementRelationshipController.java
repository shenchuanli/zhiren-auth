package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthPermissionPageElementRelationship;
import cn.zhiren.auth.entity.AuthProgramAPIRelationship;
import cn.zhiren.auth.service.IAuthPermissionPageElementRelationshipService;
import cn.zhiren.auth.service.IAuthProgramAPIRelationshipService;
import cn.zhiren.auth.service.Impl.AuthPermissionPageElementRelationshipServiceImpl;
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
@RequestMapping("/authPermissionPageElementRelationship")
public class AuthPermissionPageElementRelationshipController extends BaseController<AuthPermissionPageElementRelationshipServiceImpl,AuthPermissionPageElementRelationship> {

}

