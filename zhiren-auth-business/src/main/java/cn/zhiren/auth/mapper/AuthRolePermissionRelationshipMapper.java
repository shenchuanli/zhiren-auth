package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthRolePermissionRelationship;

public interface AuthRolePermissionRelationshipMapper {
    int deleteByPrimaryKey(String rolepermissionid);

    int insert(AuthRolePermissionRelationship record);

    int insertSelective(AuthRolePermissionRelationship record);

    AuthRolePermissionRelationship selectByPrimaryKey(String rolepermissionid);

    int updateByPrimaryKeySelective(AuthRolePermissionRelationship record);

    int updateByPrimaryKey(AuthRolePermissionRelationship record);
}