package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthProgramDataAuthRelationship;
import cn.zhiren.auth.entity.AuthProgramOperationRelationship;
import cn.zhiren.auth.service.IAuthProgramDataAuthRelationshipService;
import cn.zhiren.auth.service.IAuthProgramOperationRelationshipService;
import cn.zhiren.auth.service.Impl.AuthProgramDataAuthRelationshipServiceImpl;
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
@RequestMapping("/authProgramDataAuthRelationship")
public class AuthProgramDataAuthRelationshipController extends BaseController<AuthProgramDataAuthRelationshipServiceImpl,AuthProgramDataAuthRelationship> {

}

