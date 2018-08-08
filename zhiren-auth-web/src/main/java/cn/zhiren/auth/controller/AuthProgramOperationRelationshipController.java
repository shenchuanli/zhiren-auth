package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthProgramOperationRelationship;
import cn.zhiren.auth.entity.AuthResourceAPI;
import cn.zhiren.auth.service.IAuthProgramOperationRelationshipService;
import cn.zhiren.auth.service.IAuthResourceAPIService;
import cn.zhiren.auth.service.Impl.AuthProgramOperationRelationshipServiceImpl;
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
@RequestMapping("/authProgramOperationRelationship")
public class AuthProgramOperationRelationshipController extends BaseController<AuthProgramOperationRelationshipServiceImpl,AuthProgramOperationRelationship> {

}

