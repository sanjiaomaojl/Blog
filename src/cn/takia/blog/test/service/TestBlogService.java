package cn.takia.blog.test.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
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
    @Test
    public void test2(){
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("blogService", BlogService.class);
        NoteResult<Blog> result = service.addBlog("demo12","ceshi4444","123456");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    @Test
    public void test3(){
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("blogService", BlogService.class);
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        NoteResult<Object> result = service.delBlogs(list);
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    @Test
    public void test4(){
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("blogService", BlogService.class);
        NoteResult<Object> result = service.modifyBlog("1","demo04","123","123");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    @Test
    public void test5(){
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("blogService", BlogService.class);
        NoteResult<List<Blog>> result = service.searchList("demo");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        for (Blog blog : result.getData()) {
            System.out.println(blog.getB_diary_title());
        }
    }
}
