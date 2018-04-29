package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthResourceAPI;

public interface AuthResourceAPIMapper {
    int deleteByPrimaryKey(String apiid);

    int insert(AuthResourceAPI record);

    int insertSelective(AuthResourceAPI record);

    AuthResourceAPI selectByPrimaryKey(String apiid);

    int updateByPrimaryKeySelective(AuthResourceAPI record);

    int updateByPrimaryKey(AuthResourceAPI record);
}