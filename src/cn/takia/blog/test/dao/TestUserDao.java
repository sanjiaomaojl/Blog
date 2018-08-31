package cn.takia.blog.test.dao;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.util.BlogUtil;
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
    @Test
    public void testAddUserDao() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        UserDao dao = ctx.getBean("userDao", UserDao.class);
        User user = new User();
        String id = BlogUtil.createId();
        user.setB_user_id(id);
        user.setB_user_name("demo03");
        user.setB_user_password("123456");
        dao.addUser(user);
        System.out.println(user);
    }
}
