package cn.zhiren.auth;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Solley
 * Created Time  2018/4/14.
 */
@EnableTransactionManagement
@Configuration
@MapperScan("cn.zhiren.auth.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class MapperConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
