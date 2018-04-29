package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthRole;

public interface AuthRoleMapper {
    int deleteByPrimaryKey(String roleid);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    AuthRole selectByPrimaryKey(String roleid);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
}