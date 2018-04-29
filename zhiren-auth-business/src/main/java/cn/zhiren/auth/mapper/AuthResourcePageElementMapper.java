package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthResourcePageElement;

public interface AuthResourcePageElementMapper {
    int deleteByPrimaryKey(String pageelement);

    int insert(AuthResourcePageElement record);

    int insertSelective(AuthResourcePageElement record);

    AuthResourcePageElement selectByPrimaryKey(String pageelement);

    int updateByPrimaryKeySelective(AuthResourcePageElement record);

    int updateByPrimaryKey(AuthResourcePageElement record);
}