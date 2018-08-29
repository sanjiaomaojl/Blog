package cn.takia.blog.test.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.service.IsLoginService;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIsLoginService {
    IsLoginService loginService;
    @Before
    public void init(){
        String[] conf = {"conf/spring-mybatis.xml","conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        loginService = ctx.getBean("isLoginService",IsLoginService.class);
    }
    @Test
    public void test1(){
        NoteResult<User> result = loginService.checkIsLogin("1");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
