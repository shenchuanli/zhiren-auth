package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthPermissionOperationRelationship;

public interface AuthPermissionOperationRelationshipMapper {
    int deleteByPrimaryKey(String permissionoperation);

    int insert(AuthPermissionOperationRelationship record);

    int insertSelective(AuthPermissionOperationRelationship record);

    AuthPermissionOperationRelationship selectByPrimaryKey(String permissionoperation);

    int updateByPrimaryKeySelective(AuthPermissionOperationRelationship record);

    int updateByPrimaryKey(AuthPermissionOperationRelationship record);
}