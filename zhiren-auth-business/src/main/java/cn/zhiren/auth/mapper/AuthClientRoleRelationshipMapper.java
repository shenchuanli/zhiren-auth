package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthClientRoleRelationship;

public interface AuthClientRoleRelationshipMapper {
    int deleteByPrimaryKey(String clientroleid);

    int insert(AuthClientRoleRelationship record);

    int insertSelective(AuthClientRoleRelationship record);

    AuthClientRoleRelationship selectByPrimaryKey(String clientroleid);

    int updateByPrimaryKeySelective(AuthClientRoleRelationship record);

    int updateByPrimaryKey(AuthClientRoleRelationship record);
}