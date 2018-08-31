package cn.takia.blog.test.dao;

import cn.takia.blog.dao.BlogDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.BlogUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试代码
 */

public class TestBlogDao extends TestBase {
    private BlogDao dao;
    @Before
    public void init(){
        dao = super.getContext().getBean("blogDao", BlogDao.class);
    }
    //测试查找日记
    @Test
    public void testFindByDiaryDao(){
        List<Blog> list = dao.findByDiary();
        System.out.println(list);
        System.out.println(list.get(1).getB_diary_body());
    }
    //测试增加日记
    @Test
    public void testAddBlogDao(){
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

    //测试批量删除日记
    @Test
    public void testDelBlogs(){
        List<String> ids = new ArrayList<String>();
        ids.add("1");
        ids.add("2");
        int n = dao.delBlogs(ids);
        System.out.println(n);
    }
    //测试修改日记
    @Test
    public void modifyBlog(){
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
    //测试查询日记
    @Test
    public void testSearchListDao() {
        List<Blog> list = dao.searchList("demo");
        System.out.println(list);
        System.out.println(list.size());
    }
}
