package cn.takia.blog.test.dao;

import cn.takia.blog.dao.IsLoginDao;
import cn.takia.blog.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIsLoginDao {
    @Test
    public void testUserDao(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        IsLoginDao dao = ctx.getBean("isLoginDao",IsLoginDao.class);
        User user = dao.findByUserId("1");
        System.out.println(user);
    }
}
