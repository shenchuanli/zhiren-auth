package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthPermission;

public interface AuthPermissionMapper {
    int deleteByPrimaryKey(String permissionid);

    int insert(AuthPermission record);

    int insertSelective(AuthPermission record);

    AuthPermission selectByPrimaryKey(String permissionid);

    int updateByPrimaryKeySelective(AuthPermission record);

    int updateByPrimaryKey(AuthPermission record);
}