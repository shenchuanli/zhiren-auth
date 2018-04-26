package cn.zhiren.auth.filter;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Solley
 * Created Time  2018/4/26.
 */
public class JWTAuthenticationFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain)
            throws IOException, ServletException {

        String token = ((HttpServletRequest)request).getHeader("Authorization");
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = null;
        if (token != null) {
            //查询鉴权服务器并获得 相关的资源权限
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            Collection<GrantedAuthority> authorities = new ArrayList();
            authorities.addAll(authentication.getAuthorities());
            for(int i = 0; i < authorities.size();i++) {
                System.out.println(((SimpleGrantedAuthority)((ArrayList<GrantedAuthority>) authorities).get(i)).getAuthority());
            }
            authorities.add(new SimpleGrantedAuthority("ROLE_GET"));
            System.out.println(authentication.getPrincipal());
            usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),authentication.getCredentials(),authorities);
        }
        SecurityContextHolder.getContext()
                .setAuthentication(usernamePasswordAuthenticationToken);
        filterChain.doFilter(request,response);
    }
}