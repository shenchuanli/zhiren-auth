package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthPermissionMenuRelationship;
import cn.zhiren.auth.entity.AuthPermissionOperationRelationship;
import cn.zhiren.auth.service.IAuthPermissionMenuRelationshipService;
import cn.zhiren.auth.service.IAuthPermissionOperationRelationshipService;
import cn.zhiren.auth.service.Impl.AuthPermissionMenuRelationshipServiceImpl;
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
@RequestMapping("/authPermissionMenuRelationship")
public class AuthPermissionMenuRelationshipController extends BaseController<AuthPermissionMenuRelationshipServiceImpl,AuthPermissionMenuRelationship> {

}

