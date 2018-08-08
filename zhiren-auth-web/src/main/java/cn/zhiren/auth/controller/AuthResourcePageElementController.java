package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthResourcePageElement;
import cn.zhiren.auth.entity.AuthRole;
import cn.zhiren.auth.service.IAuthResourcePageElementService;
import cn.zhiren.auth.service.IAuthRoleService;
import cn.zhiren.auth.service.Impl.AuthResourcePageElementServiceImpl;
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
@RequestMapping("/authResourcePageElement")
public class AuthResourcePageElementController extends BaseController<AuthResourcePageElementServiceImpl,AuthResourcePageElement> {

}

