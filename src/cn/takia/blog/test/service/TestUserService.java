package cn.takia.blog.test.service;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.service.UserService;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService extends TestBase {
    private UserService service;
    @Before
    public void init(){
        service = super.getContext().getBean("userService",UserService.class);
    }
    //登陆
    @Test
    public void testCheckLogin(){
        NoteResult<User> result = service.checkLogin("demo","12");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
