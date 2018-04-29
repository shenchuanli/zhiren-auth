package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthGroupClientRelationship;

public interface AuthGroupClientRelationshipMapper {
    int deleteByPrimaryKey(String groupclientid);

    int insert(AuthGroupClientRelationship record);

    int insertSelective(AuthGroupClientRelationship record);

    AuthGroupClientRelationship selectByPrimaryKey(String groupclientid);

    int updateByPrimaryKeySelective(AuthGroupClientRelationship record);

    int updateByPrimaryKey(AuthGroupClientRelationship record);
}