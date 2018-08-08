package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.Program;
import cn.zhiren.auth.mapper.ProgramMapper;
import cn.zhiren.auth.service.IProgramService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Solley
 * @since 2018-08-03
 */
@Service
public class ProgramServiceImpl extends ServiceImpl<ProgramMapper, Program> implements IProgramService {

}
