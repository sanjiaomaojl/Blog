package cn.takia.blog.test.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestBlogService {
    BlogService service;
    @Test
    public void test1() {
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("blogService", BlogService.class);
        NoteResult<List<Blog>> result = service.loadBlogDiary();
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        for (Blog blog : result.getData()) {
            System.out.println(blog.getB_diary_title());
        }
    }
}
