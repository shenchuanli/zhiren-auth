package cn.zhiren.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalConfig {
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

//    @Bean
//    public Queue Queue() {
//        return new Queue("queues1");
//    }
//    @Bean
//    public HttpMessageConverters fastJsonConverters(){
//        FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastConf = new FastJsonConfig();
//
//        fastConf.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastJsonConverter.setFastJsonConfig(fastConf);
//
//        HttpMessageConverter<?> converter = fastJsonConverter;
//        return new HttpMessageConverters(converter);
//    }
}
