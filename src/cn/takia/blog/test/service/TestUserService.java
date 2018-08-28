package cn.takia.blog.test.service;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.service.UserService;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    UserService service;
    @Before
    public void init(){
        String[] conf = {"conf/spring-mybatis.xml","conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("userService",UserService.class);
    }
    @Test
    public void test1(){
        NoteResult<User> result = service.checkLogin("demo","12");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
