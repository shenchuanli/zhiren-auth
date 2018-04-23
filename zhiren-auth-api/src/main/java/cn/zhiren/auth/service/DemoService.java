package cn.zhiren.auth.service;

import cn.zhiren.auth.dto.DemoDTO;

import java.util.List;

public interface DemoService {
    public boolean setDemo(DemoDTO dto);

    public boolean updateDemo(DemoDTO dto);

    public boolean deleteDemo(String code);

    public List<DemoDTO> getDemos(String name);
}
