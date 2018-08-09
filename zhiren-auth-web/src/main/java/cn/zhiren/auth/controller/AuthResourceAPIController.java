package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthResourceAPI;
import cn.zhiren.auth.entity.AuthResourceMenu;
import cn.zhiren.auth.service.IAuthResourceAPIService;
import cn.zhiren.auth.service.IAuthResourceMenuService;
import cn.zhiren.auth.service.Impl.AuthResourceAPIServiceImpl;
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
@Api(value = "api资源相关接口", description = "api资源相关接口")
@RestController
@RequestMapping("/authResourceAPI")
public class AuthResourceAPIController extends BaseController<IAuthResourceAPIService,AuthResourceAPI> {

}

