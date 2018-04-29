package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthResourceMenu;

public interface AuthResourceMenuMapper {
    int deleteByPrimaryKey(String menuid);

    int insert(AuthResourceMenu record);

    int insertSelective(AuthResourceMenu record);

    AuthResourceMenu selectByPrimaryKey(String menuid);

    int updateByPrimaryKeySelective(AuthResourceMenu record);

    int updateByPrimaryKey(AuthResourceMenu record);
}