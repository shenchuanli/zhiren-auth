package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.AuthRole;
import cn.zhiren.auth.mapper.AuthRoleMapper;
import cn.zhiren.auth.service.IAuthRoleService;
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
public class AuthRoleServiceImpl extends ServiceImpl<AuthRoleMapper, AuthRole> implements IAuthRoleService {

}
