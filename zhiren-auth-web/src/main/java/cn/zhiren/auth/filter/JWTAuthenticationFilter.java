package cn.zhiren.auth.filter;

import cn.zhiren.core.BaseCommon.BaseContextHandler;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Solley
 * Created Time  2018/4/26.
 */
public class JWTAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String token = httpServletRequest.getHeader("Authorization");
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = null;
        if (token != null) {
            //查询鉴权服务器并获得 相关的资源权限
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            Collection<GrantedAuthority> authorities = new ArrayList();
            authorities.addAll(authentication.getAuthorities());
            for(int i = 0; i < authorities.size();i++) {
                //System.out.println(((ArrayList<GrantedAuthority>) authorities).get(i).getAuthority());
            }
            authorities.add(new SimpleGrantedAuthority("ROLE_GET"));
            BaseContextHandler.setName(authentication.getPrincipal().toString());
            //System.out.println(authentication.getPrincipal());
            httpServletRequest.setAttribute("username", authentication.getPrincipal());
            usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),authentication.getCredentials(),authorities);
        }
        SecurityContextHolder.getContext()
                .setAuthentication(usernamePasswordAuthenticationToken);
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}