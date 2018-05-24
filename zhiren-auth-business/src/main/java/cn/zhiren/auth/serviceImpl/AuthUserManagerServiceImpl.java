package cn.zhiren.auth.serviceImpl;

import cn.zhiren.auth.dto.AuthUserManager.*;
import cn.zhiren.auth.mapper.AuthUserMapper;
import cn.zhiren.auth.po.AuthUser;
import cn.zhiren.auth.service.AuthUserManagerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Solley
 * Created Time  2018/5/24.
 */
@Service
public class AuthUserManagerServiceImpl implements AuthUserManagerService {

    @Autowired
    private AuthUserMapper authUserMapper;

    /**
     * @param authUserQueryParameterDTO
     * @Author:Solley
     * @Description: 获得用户权限信息
     * @Date: 2018/5/24 19:38
     * @param:
     * @return: * @param null
     */
    @Override
    public PageInfo<AuthUserDTO> getAuthUserPage(AuthUserQueryParameterDTO authUserQueryParameterDTO) {
        PageHelper.startPage(authUserQueryParameterDTO.getPage(), authUserQueryParameterDTO.getPageSize());
        List<AuthUser> authUsers = authUserMapper.selectPageByDisplayname(authUserQueryParameterDTO.getDisplayname());
        PageInfo<AuthUser> page = new PageInfo(authUsers);

        //转dto
        ModelMapper modelMapper = new ModelMapper();
        PageInfo<AuthUserDTO> authUserDTOS = modelMapper.map(page, new TypeToken<PageInfo<AuthUserDTO>>() {
        }.getType());
        return authUserDTOS;
    }

    /**
     * @param authUserDTO
     * @Author:Solley
     * @Description: 更新用户权限
     * @Date: 2018/5/24 19:49
     * @param:
     * @return: * @param null
     */
    @Override
    public boolean updateAuthUser(AuthUserDTO authUserDTO) {
        return false;
    }

    /**
     * @param modifyPasswordDTO
     * @Author:Solley
     * @Description:修改密码
     * @Date: 2018/5/24 19:50
     * @param:
     * @return: * @param null
     */
    @Override
    public boolean modifyPassword(ModifyPasswordDTO modifyPasswordDTO) {
        return false;
    }

    /**
     * @param authUserDTO
     * @Author:Solley
     * @Description:插入用户信息
     * @Date: 2018/5/24 19:50
     * @param:
     * @return: * @param null
     */
    @Override
    public boolean insertAuthUser(AuthUserDTO authUserDTO) {
        return false;
    }

    /**
     * @param loginRequestDTO
     * @Author:Solley
     * @Description:登陆
     * @Date: 2018/5/24 19:52
     * @param:
     * @return: * @param null
     */
    @Override
    public LoginResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}
