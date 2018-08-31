package cn.takia.blog.test.dao;

import cn.takia.blog.dao.DiaryDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.test.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试测试CS
 */
public class TestDiaryDao extends TestBase {
    private DiaryDao diaryDao;
    @Before
    public void init(){
        diaryDao = super.getContext().getBean("DiaryDao", DiaryDao.class);
    }
    //测试能否查出笔记，内容、真正的内容
    @Test
    public void testUserDao(){
        Blog blog = diaryDao.findByDiaryId("1");
        System.out.println(blog);
    }
}
