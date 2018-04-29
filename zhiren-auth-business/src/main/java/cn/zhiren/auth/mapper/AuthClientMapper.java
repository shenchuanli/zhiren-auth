package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthClient;

public interface AuthClientMapper {
    int deleteByPrimaryKey(String clientid);

    int insert(AuthClient record);

    int insertSelective(AuthClient record);

    AuthClient selectByPrimaryKey(String clientid);

    int updateByPrimaryKeySelective(AuthClient record);

    int updateByPrimaryKey(AuthClient record);
}