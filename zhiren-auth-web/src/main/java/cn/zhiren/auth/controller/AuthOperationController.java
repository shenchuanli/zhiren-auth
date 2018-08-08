package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthOperation;
import cn.zhiren.auth.entity.AuthPermissionAPIRelationship;
import cn.zhiren.auth.service.IAuthOperationService;
import cn.zhiren.auth.service.IAuthPermissionAPIRelationshipService;
import cn.zhiren.auth.service.Impl.AuthOperationServiceImpl;
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
@RequestMapping("/authOperation")
public class AuthOperationController extends BaseController<AuthOperationServiceImpl,AuthOperation> {

}

