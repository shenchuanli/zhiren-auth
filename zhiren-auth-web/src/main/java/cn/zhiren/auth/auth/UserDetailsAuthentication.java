package cn.zhiren.auth.auth;

import cn.zhiren.auth.entity.AuthTenant;
import cn.zhiren.auth.entity.AuthUser;
import cn.zhiren.auth.service.IAuthUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Solley
 * Created Time  2018/4/24.
 */
@Component
public class UserDetailsAuthentication implements UserDetailsService {
    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Autowired
    private IAuthUserService iAuthUserService;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        EntityWrapper<AuthUser> ew = new EntityWrapper<AuthUser>();
        ew.where("Username={0}",name);
        List<AuthUser> authUsers = iAuthUserService.selectList(ew);
        if(authUsers != null && authUsers.size() > 0) {
            AuthUser authUser = authUsers.stream().findFirst().get();
            User user = mockUser(authUser);
            return user;
        }
        return null;
    }

    private User mockUser(AuthUser authUser) {
        Collection<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_AUTH_COMMON"));
        User user = new User(authUser.getUsername(),authUser.getPassword(),authorities);
        return user;
    }
}
