package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthGroupUserRelationship;

public interface AuthGroupUserRelationshipMapper {
    int deleteByPrimaryKey(String groupuserid);

    int insert(AuthGroupUserRelationship record);

    int insertSelective(AuthGroupUserRelationship record);

    AuthGroupUserRelationship selectByPrimaryKey(String groupuserid);

    int updateByPrimaryKeySelective(AuthGroupUserRelationship record);

    int updateByPrimaryKey(AuthGroupUserRelationship record);
}