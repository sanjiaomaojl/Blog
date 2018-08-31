package cn.takia.blog.test.dao;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.BlogUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试关于用户的
 */
public class TestUserDao extends TestBase {

    private UserDao dao;
    @Before
    public void init(){
        dao = super.getContext().getBean("userDao",UserDao.class);
    }
    //测试登陆
    @Test
    public void testUserDao(){
        User user = dao.findByName("demo");
        System.out.println(user);
    }
    //测试增加用户(注册)
    @Test
    public void testAddUserDao() {
        User user = new User();
        String id = BlogUtil.createId();
        user.setB_user_id(id);
        user.setB_user_name("demo05");
        user.setB_user_password("123456");
        dao.addUser(user);
        System.out.println(user);
    }
}
