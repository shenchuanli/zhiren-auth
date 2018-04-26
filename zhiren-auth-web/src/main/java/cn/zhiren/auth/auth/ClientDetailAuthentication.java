package cn.zhiren.auth.auth;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

/**
 * Created by Solley
 * Created Time  2018/4/26.
 */
@Component
public class ClientDetailAuthentication implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        return null;
    }

//    private User mockUser() {
//        Collection<ClientDetails> authorities = new HashSet<>();
//        authorities.add(new ClientDetails());
//
//        User user = new User("123456","123456",authorities);
//        return user;
//    }
}
