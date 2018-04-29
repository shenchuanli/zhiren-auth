package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthPermissionPageElementRelationship;

public interface AuthPermissionPageElementRelationshipMapper {
    int deleteByPrimaryKey(String permissionpageelementid);

    int insert(AuthPermissionPageElementRelationship record);

    int insertSelective(AuthPermissionPageElementRelationship record);

    AuthPermissionPageElementRelationship selectByPrimaryKey(String permissionpageelementid);

    int updateByPrimaryKeySelective(AuthPermissionPageElementRelationship record);

    int updateByPrimaryKey(AuthPermissionPageElementRelationship record);
}