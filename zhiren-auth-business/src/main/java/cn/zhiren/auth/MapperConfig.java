package cn.zhiren.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Solley
 * Created Time  2018/4/14.
 */
@Configuration
@MapperScan("cn.zhiren.auth.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class MapperConfig {
}
