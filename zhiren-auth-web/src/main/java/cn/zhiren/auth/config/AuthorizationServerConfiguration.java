package cn.zhiren.auth.config;

import cn.zhiren.auth.auth.ClientDetailAuthentication;
import cn.zhiren.auth.auth.UserDetailsAuthentication;
import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.service.IAuthUserService;
import cn.zhiren.core.BaseCommon.CommonConstants;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Solley
 * Created Time  2018/4/24.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
    int accessTokenValiditySeconds = 3600;

    /**
    * @Author:Solley
    * @Description:权限管理
    * @Date: 2018/4/26 21:19
    * @param:
    * @return:  * @param null
    */
    @Autowired
    private AuthenticationManager authenticationManager;

    /**
    * @Author:Solley
    * @Description:用户验证
    * @Date: 2018/4/26 21:19
    * @param:
    * @return:  * @param null
    */
    @Autowired
    private UserDetailsAuthentication userDetailsAuthentication;

    /**
    * @Author:Solley
    * @Description: 客户端验证
    * @Date 21:18
    * @param:
    * @return:  * @param null
    */
    @Autowired
    public ClientDetailAuthentication clientDetailAuthentication;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //clients.withClientDetails(clientDetailAuthentication);
        //配置三个客户端,一个用于password认证一个用于client认证，一个授权码认证
        clients.inMemory().withClient("client_credentials")
                .authorizedGrantTypes("client_credentials", "refresh_token")
                .scopes("select")
                .authorities("oauth2")
                .secret("123456").accessTokenValiditySeconds(accessTokenValiditySeconds)
                .and().withClient("client_password")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("select")
                .authorities("oauth2")
                .secret("123456").accessTokenValiditySeconds(accessTokenValiditySeconds)
                .and().withClient("client_code") // client_id
                .secret("secret") // client_secret
                .authorizedGrantTypes("authorization_code") // 该client允许的授权类型
                .authorities("oauth2").accessTokenValiditySeconds(accessTokenValiditySeconds)
                .scopes("app"); // 允许的授权范围
    }

    @Override
    public void configure(final AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        //允许表单认证
        oauthServer.allowFormAuthenticationForClients()
        ;
    }

    @Override
    public void configure(final AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // @formatter:off
        endpoints.authenticationManager(authenticationManager);
        endpoints.userDetailsService(userDetailsAuthentication);
        endpoints.allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
        endpoints.tokenStore(tokenStore());

        TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
        List<TokenEnhancer> enhancerList = new ArrayList<>();
        enhancerList.add(jwtTokenEnhancer());
        enhancerList.add(accessTokenConverter());
        enhancerChain.setTokenEnhancers(enhancerList);

        endpoints.tokenEnhancer(enhancerChain)
                .accessTokenConverter(accessTokenConverter());

    }

    /**
     * token store
     *
     * @param
     * @return
     */
    @Bean
    public TokenStore tokenStore() {
        TokenStore tokenStore = new JwtTokenStore(accessTokenConverter());
        return tokenStore;
    }

    /**
     * create by: Solley
     * description:token 转jwt
     * create time: 16:27 2018/8/9
     *  * @Param: null
     * @return 
     */
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
        accessTokenConverter.setSigningKey(CommonConstants.JWT_PUBLIC_KEY);
        return accessTokenConverter;
    }

    /**
     * create by: Solley
     * description:给jwt添加自己的内容
     * create time: 16:28 2018/8/9
     *  * @Param: null
     * @return 
     */
    @Bean
    public TokenEnhancer jwtTokenEnhancer(){
        return new JwtTokenEnhancer();
    }
}
