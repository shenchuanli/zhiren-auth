package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthUser;

public interface AuthUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
}