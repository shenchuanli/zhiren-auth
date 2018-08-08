package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.dto.AuthUserDTO.UserDTO;
import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.mapper.AuthUserMapper;
import cn.zhiren.auth.service.IAuthUserService;
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
public class AuthUserServiceImpl extends ServiceImpl<AuthUserMapper, AuthUser> implements IAuthUserService {

    /**
     * create by: Solley
     * description:获得用户相关信息
     * create time: 16:47 2018/8/7
     *  * @Param: null
     * @return 
     */
    @Override
    public UserDTO getUserInfo(String userId) {
        return null;
    }
}
