package cn.zhiren.auth.config;

import cn.zhiren.auth.auth.ClientDetailAuthentication;
import cn.zhiren.auth.auth.UserDetailsAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

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
        clients.inMemory().withClient("client_1")
                .authorizedGrantTypes("client_credentials", "refresh_token")
                .scopes("select")
                .authorities("oauth2")
                .secret("123456").accessTokenValiditySeconds(accessTokenValiditySeconds)
                .and().withClient("client_2")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("select")
                .authorities("oauth2")
                .secret("123456").accessTokenValiditySeconds(accessTokenValiditySeconds)
                .and().withClient("client_3") // client_id
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
        endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsAuthentication)
                .accessTokenConverter(accessTokenConverter())
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
               // .accessTokenConverter(accessTokenConverter());
        // @formatter:on
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter() {
//            @Override
//            public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
//                String userName = authentication.getUserAuthentication().getName();
//                User user = (User) authentication.getUserAuthentication().getPrincipal();
//                Map<String,Object> infoMap = new HashMap<>();
////                infoMap.put("userId",userName);
////                infoMap.put("roles",user.getAuthorities());
//                ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(infoMap);
//                OAuth2AccessToken token = super.enhance(accessToken, authentication);
//                return token;
//            }
        };
        converter.setSigningKey("zhiren123");
        return converter;
    }
}
