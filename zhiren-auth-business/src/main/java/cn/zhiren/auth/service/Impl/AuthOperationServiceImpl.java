package cn.zhiren.auth.service.Impl;

import cn.zhiren.auth.entity.AuthOperation;
import cn.zhiren.auth.mapper.AuthOperationMapper;
import cn.zhiren.auth.service.IAuthOperationService;
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
public class AuthOperationServiceImpl extends ServiceImpl<AuthOperationMapper, AuthOperation> implements IAuthOperationService {

}
