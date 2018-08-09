package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthClient;
import cn.zhiren.auth.entity.AuthClientRoleRelationship;
import cn.zhiren.auth.service.IAuthClientRoleRelationshipService;
import cn.zhiren.auth.service.IAuthClientService;
import cn.zhiren.auth.service.Impl.AuthClientServiceImpl;
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
@Api(value = "第三方客户端管理相关", description = "第三方客户端管理相关")
@RestController
@RequestMapping("/authClient")
public class AuthClientController extends BaseController<IAuthClientService,AuthClient> {

}

