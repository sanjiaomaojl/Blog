package cn.takia.blog.test.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.service.IsLoginService;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIsLoginService extends TestBase {
    private IsLoginService loginService;
    @Before
    public void init(){
        loginService = super.getContext().getBean("isLoginService",IsLoginService.class);
    }
    //是否登陆。检查一下吧
    @Test
    public void test1(){
        NoteResult<User> result = loginService.checkIsLogin("1");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
