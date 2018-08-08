package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.AuthTenant;
import cn.zhiren.auth.mapper.AuthTenantMapper;
import cn.zhiren.auth.service.IAuthTenantService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Service
public class AuthTenantServiceImpl extends ServiceImpl<AuthTenantMapper, AuthTenant> implements IAuthTenantService {

}
