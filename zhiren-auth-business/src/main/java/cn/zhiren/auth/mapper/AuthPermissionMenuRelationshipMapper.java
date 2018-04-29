package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthPermissionMenuRelationship;

public interface AuthPermissionMenuRelationshipMapper {
    int deleteByPrimaryKey(String permissionmenuid);

    int insert(AuthPermissionMenuRelationship record);

    int insertSelective(AuthPermissionMenuRelationship record);

    AuthPermissionMenuRelationship selectByPrimaryKey(String permissionmenuid);

    int updateByPrimaryKeySelective(AuthPermissionMenuRelationship record);

    int updateByPrimaryKey(AuthPermissionMenuRelationship record);
}