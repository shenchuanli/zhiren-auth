package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.AuthTenant;
import cn.zhiren.auth.entity.Program;
import cn.zhiren.auth.service.IAuthTenantService;
import cn.zhiren.auth.service.IProgramService;
import cn.zhiren.auth.service.Impl.ProgramServiceImpl;
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
@Api(value = "程序模块", description = "程序模块相关接口")
@RestController
@RequestMapping("/program")
public class ProgramController extends BaseController<ProgramServiceImpl,Program> {

}

