package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthResourceMenu;
import cn.zhiren.auth.entity.AuthResourcePageElement;
import cn.zhiren.auth.service.IAuthResourceMenuService;
import cn.zhiren.auth.service.IAuthResourcePageElementService;
import cn.zhiren.auth.service.Impl.AuthResourceMenuServiceImpl;
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
@RequestMapping("/authResourceMenu")
public class AuthResourceMenuController extends BaseController<AuthResourceMenuServiceImpl,AuthResourceMenu> {

}

