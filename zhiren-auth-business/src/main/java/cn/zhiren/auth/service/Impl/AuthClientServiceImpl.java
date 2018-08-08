package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.AuthClient;
import cn.zhiren.auth.mapper.AuthClientMapper;
import cn.zhiren.auth.service.IAuthClientService;
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
public class AuthClientServiceImpl extends ServiceImpl<AuthClientMapper, AuthClient> implements IAuthClientService {

}
