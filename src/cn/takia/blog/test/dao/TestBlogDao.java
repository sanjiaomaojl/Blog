package cn.takia.blog.test.dao;

import cn.takia.blog.dao.BlogDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.BlogUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Test
    public void testAddBlogDao(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        BlogDao dao = ctx.getBean("blogDao", BlogDao.class);
        Blog blog = new Blog();
        String blog_id = BlogUtil.createId();
        blog.setB_diary_id(blog_id);
        blog.setB_diary_title("demo03");
        blog.setB_diary_body("测试数据3");
        blog.setB_diary_show_body("123456");
        long now=System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        blog.setB_diary_create_time(sdf.format(now));
        blog.setB_diary_update_time(sdf.format(now));
        dao.addBlog(blog);
    }

    @Test
    public void testDelBlogs(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        BlogDao dao = ctx.getBean("blogDao", BlogDao.class);
        List<String> ids = new ArrayList<String>();
        ids.add("1");
        ids.add("2");
        int n = dao.delBlogs(ids);
        System.out.println(n);
    }
    @Test
    public void modifyBlog(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        BlogDao dao = ctx.getBean("blogDao", BlogDao.class);
        Blog blog = new Blog();
        blog.setB_diary_id("1");
        blog.setB_diary_title("demo03");
        blog.setB_diary_body("测试数据3");
        blog.setB_diary_show_body("123456");
        long now=System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        blog.setB_diary_update_time(sdf.format(now));
        int n = dao.modifyBlog(blog);
        System.out.println(n);
    }
    @Test
    public void testSearchListDao() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        BlogDao dao = ctx.getBean("blogDao", BlogDao.class);
        List<Blog> list = dao.searchList("demo");
        System.out.println(list);
        System.out.println(list.size());
    }
}
