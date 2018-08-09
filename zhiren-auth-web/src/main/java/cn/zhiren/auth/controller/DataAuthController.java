package cn.zhiren.auth.controller;


import cn.zhiren.auth.entity.DataAuth;
import cn.zhiren.auth.entity.Program;
import cn.zhiren.auth.service.IDataAuthService;
import cn.zhiren.auth.service.IProgramService;
import cn.zhiren.auth.service.Impl.DataAuthServiceImpl;
import cn.zhiren.core.BaseCommon.BaseController;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Api(value = "数据权限模块", description = "数据权限模块相关接口")
@RestController
@RequestMapping("/dataAuth")
public class DataAuthController extends BaseController<IDataAuthService,DataAuth> {

}

