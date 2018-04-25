package cn.zhiren.auth.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Solley
 * Created Time  2018/4/24.
 */
@Component
public class UserDetailsAuthentication implements UserDetailsService {
    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        if ("123456".equalsIgnoreCase(name)) {
            User user = mockUser();
            return user;
        }
        return null;
    }

    private User mockUser() {
        Collection<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_SOMEROLE"));

        User user = new User("123456","123456",authorities);
        return user;
    }
}
