package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthGroup;

public interface AuthGroupMapper {
    int deleteByPrimaryKey(String groupid);

    int insert(AuthGroup record);

    int insertSelective(AuthGroup record);

    AuthGroup selectByPrimaryKey(String groupid);

    int updateByPrimaryKeySelective(AuthGroup record);

    int updateByPrimaryKey(AuthGroup record);
}