package cn.zhiren.auth.config;

import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.service.IAuthUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by: Solley
 * description:
 * create time: 16:26 2018/8/9
 *  * @Param: null
 * @return 
 */
public class JwtTokenEnhancer implements TokenEnhancer {
    /**
     * create by: Solley
     * description:用户相关信息
     * create time: 16:03 2018/8/9
     *  * @Param: null
     * @return
     */
    @Autowired
    private IAuthUserService iAuthUserService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        String userName = oAuth2Authentication.getUserAuthentication().getName();

        //作者
        Map<String,Object> info = new HashMap<>();

        //添加租户ID与用户id
        EntityWrapper<AuthUser> ew = new EntityWrapper<AuthUser>();
        ew.where("Username={0}",userName);
        List<AuthUser> authUsers = iAuthUserService.selectList(ew);
        if(authUsers != null && authUsers.size() > 0){
            AuthUser authUser = authUsers.stream().findFirst().get();
            info.put("tenantID",authUser.getTenantID());
            info.put("userID",authUser.getUserId());
        }

        //设置附加信息
        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(info);
        return oAuth2AccessToken;
    }
}
