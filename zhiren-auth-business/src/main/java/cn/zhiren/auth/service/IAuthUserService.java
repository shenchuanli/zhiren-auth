package cn.zhiren.auth.service;

import cn.zhiren.auth.dto.AuthUserDTO.UserDTO;
import cn.zhiren.auth.entity.AuthUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
public interface IAuthUserService extends IService<AuthUser> {

    UserDTO getUserInfo(String userId);
}
