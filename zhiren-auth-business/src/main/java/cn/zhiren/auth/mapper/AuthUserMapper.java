package cn.zhiren.auth.mapper;

import cn.zhiren.auth.po.AuthUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(String userid);

    List<AuthUser> selectPageByDisplayname(@Param("displayname")String displayname);//, @Param("pageNum")int pageNumKey, @Param("pageSize")int pageSizeKey);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);
}