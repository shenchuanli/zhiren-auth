package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.AuthGroup;
import cn.zhiren.auth.mapper.AuthGroupMapper;
import cn.zhiren.auth.service.IAuthGroupService;
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
public class AuthGroupServiceImpl extends ServiceImpl<AuthGroupMapper, AuthGroup> implements IAuthGroupService {

}
