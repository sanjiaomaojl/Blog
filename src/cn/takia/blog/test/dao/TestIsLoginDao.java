package cn.takia.blog.test.dao;

import cn.takia.blog.dao.IsLoginDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.test.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cs cs
 * 测试
 */
public class TestIsLoginDao extends TestBase {
    private IsLoginDao dao;
    @Before
    public void init(){
        dao = super.getContext().getBean("isLoginDao",IsLoginDao.class);
    }

    /**
     * 测试是否登陆
     */

    @Test
    public void testUserDao(){
        User user = dao.findByUserId("1");
        System.out.println(user);
    }
}
