package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthGroupRoleRelationship;

public interface AuthGroupRoleRelationshipMapper {
    int deleteByPrimaryKey(String grouproleid);

    int insert(AuthGroupRoleRelationship record);

    int insertSelective(AuthGroupRoleRelationship record);

    AuthGroupRoleRelationship selectByPrimaryKey(String grouproleid);

    int updateByPrimaryKeySelective(AuthGroupRoleRelationship record);

    int updateByPrimaryKey(AuthGroupRoleRelationship record);
}