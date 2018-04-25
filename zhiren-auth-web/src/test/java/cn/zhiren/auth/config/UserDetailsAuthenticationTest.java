package cn.zhiren.auth.config;

import cn.zhiren.auth.ZhirenApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Solley
 * Created Time  2018/4/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ZhirenApplication.class)
public class UserDetailsAuthenticationTest {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Test
    public void getPasswordEncoder() {
        System.out.println(passwordEncoder.encode("123456"));
    }
}