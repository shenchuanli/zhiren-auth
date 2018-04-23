package cn.zhiren.auth.mapper;

import cn.zhiren.auth.model.Demo;

import java.util.List;

public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int deleteByCode(String code);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    List<Demo> selectByCode(String code);

    List<Demo> selectAll();

    int updateByPrimaryKeySelective(Demo record);

    int updateBatch(List<Demo> records);

    int updateByPrimaryKey(Demo record);
}
