package cn.takia.blog.test.dao;

import cn.takia.blog.dao.DiaryDao;
import cn.takia.blog.entity.Blog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDiaryDao {
    @Test
    public void testUserDao(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        DiaryDao diaryDao = ctx.getBean("diaryDao",DiaryDao.class);
        Blog blog = diaryDao.findByDiaryId("1");
        System.out.println(blog);
    }
}
