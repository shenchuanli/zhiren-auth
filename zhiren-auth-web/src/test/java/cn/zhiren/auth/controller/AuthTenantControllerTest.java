package cn.zhiren.auth.controller;

import cn.zhiren.auth.ZhirenApplication;
import cn.zhiren.auth.entity.AuthTenant;
import cn.zhiren.auth.mapper.AuthTenantMapper;
import cn.zhiren.auth.service.IAuthTenantService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ZhirenApplication.class)
public class AuthTenantControllerTest {
    @Autowired
    private IAuthTenantService iAuthTenantService;

    @Autowired
    private AuthTenantMapper authTenantMapper;

    @Test
    public void TestPage(){
        EntityWrapper<AuthTenant> ew = new EntityWrapper<AuthTenant>();
        ew.setEntity(new AuthTenant());
        ew.where("TenantID={0}","2");
        List<AuthTenant> authTenantList = iAuthTenantService.selectList(ew);
        Page<AuthTenant> pg = new Page<>(1,10);
        Page<AuthTenant> authTenant = iAuthTenantService.selectPage(pg);
    }

    @Test
    public void TestTenant(){
        System.out.println("哈哈哈哈");
        AuthTenant authTenant = new AuthTenant();
        authTenant.setTenantID("1");
        authTenant.setTenantName("普通租户");
        authTenant.setSuperTenant(1);
        //authTenant.insert();
        //iAuthTenantService.insert(authTenant);
        //AuthTenant authTenant1 = authTenantMapper.selectById("1");
        EntityWrapper<AuthTenant> wa = new EntityWrapper<AuthTenant>();
        //wa.setEntity(authTenant);
        wa.where("user_name={0}", "'zhangsan'").and("id=1")
                .orNew("user_status={0}", "0").or("status=1")
                .notLike("user_nickname", "notvalue")
                .andNew("new=xx").like("hhh", "ddd")
                .andNew("pwd=11").isNotNull("n1,n2").isNull("n3")
                .groupBy("x1").groupBy("x2,x3")
                .having("x1=11").having("x3=433")
                .orderBy("dd").orderBy("d1,d2");

        System.out.println(wa.getSqlSegment());
    }


}