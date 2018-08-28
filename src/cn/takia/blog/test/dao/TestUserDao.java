package cn.takia.blog.test.dao;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void testUserDao(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        UserDao dao = ctx.getBean("userDao",UserDao.class);
        User user = dao.findByName("demo");
        System.out.println(user);
    }
}
