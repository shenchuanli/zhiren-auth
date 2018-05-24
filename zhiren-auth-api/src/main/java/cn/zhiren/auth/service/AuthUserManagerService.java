package cn.zhiren.auth.service;

import cn.zhiren.auth.dto.AuthUserManager.*;
import com.github.pagehelper.PageInfo;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
public interface AuthUserManagerService {
    
    /**
    * @Author:Solley
    * @Description: 获得用户权限信息
    * @Date: 2018/5/24 19:38
    * @param:   
    * @return:  * @param null
    */
    PageInfo<AuthUserDTO> getAuthUserPage(AuthUserQueryParameterDTO authUserQueryParameterDTO);

    /**
    * @Author:Solley
    * @Description: 更新用户权限
    * @Date: 2018/5/24 19:49
    * @param:
    * @return:  * @param null
    */
    boolean updateAuthUser(AuthUserDTO authUserDTO);

    /**
    * @Author:Solley
    * @Description:修改密码
    * @Date: 2018/5/24 19:50
    * @param:
    * @return:  * @param null
    */
    boolean modifyPassword(ModifyPasswordDTO modifyPasswordDTO);

    /**
    * @Author:Solley
    * @Description:插入用户信息
    * @Date: 2018/5/24 19:50
    * @param:
    * @return:  * @param null
    */
    boolean insertAuthUser(AuthUserDTO authUserDTO);

    /**
    * @Author:Solley
    * @Description:登陆
    * @Date: 2018/5/24 19:52
    * @param:
    * @return:  * @param null
    */
    LoginResponseDTO login(LoginRequestDTO loginRequestDTO);
}
