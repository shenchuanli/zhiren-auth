package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthOperation;

public interface AuthOperationMapper {
    int deleteByPrimaryKey(String operationid);

    int insert(AuthOperation record);

    int insertSelective(AuthOperation record);

    AuthOperation selectByPrimaryKey(String operationid);

    int updateByPrimaryKeySelective(AuthOperation record);

    int updateByPrimaryKey(AuthOperation record);
}