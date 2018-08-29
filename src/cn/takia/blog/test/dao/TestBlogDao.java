package cn.takia.blog.test.dao;

import cn.takia.blog.dao.BlogDao;
import cn.takia.blog.entity.Blog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestBlogDao {
    @Test
    public void testUserDao(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        BlogDao dao = ctx.getBean("blogDao", BlogDao.class);
        List<Blog> list = dao.findByDiary();
        System.out.println(list);
        System.out.println(list.get(1).getB_diary_body());
    }
}
