package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthGroup;
import cn.zhiren.auth.entity.AuthGroupClientRelationship;
import cn.zhiren.auth.service.IAuthGroupClientRelationshipService;
import cn.zhiren.auth.service.IAuthGroupService;
import cn.zhiren.auth.service.Impl.AuthGroupClientRelationshipServiceImpl;
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
@RequestMapping("/authGroupClientRelationship")
public class AuthGroupClientRelationshipController extends BaseController<AuthGroupClientRelationshipServiceImpl,AuthGroupClientRelationship> {

}

