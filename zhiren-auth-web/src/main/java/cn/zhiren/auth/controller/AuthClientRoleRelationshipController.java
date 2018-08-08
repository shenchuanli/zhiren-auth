package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthClientRoleRelationship;
import cn.zhiren.auth.entity.AuthGroupClientRelationship;
import cn.zhiren.auth.service.IAuthClientRoleRelationshipService;
import cn.zhiren.auth.service.IAuthGroupClientRelationshipService;
import cn.zhiren.auth.service.Impl.AuthClientRoleRelationshipServiceImpl;
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
@RequestMapping("/authClientRoleRelationship")
public class AuthClientRoleRelationshipController extends BaseController<AuthClientRoleRelationshipServiceImpl,AuthClientRoleRelationship> {

}

