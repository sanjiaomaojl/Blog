package cn.takia.blog.test.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBlogService extends TestBase {
    private BlogService service;
    @Before
    public void init(){
        service = super.getContext().getBean("blogService", BlogService.class);
    }

    //加载博客
    @Test
    public void testLoadBlogDiary() {
        NoteResult<List<Blog>> result = service.loadBlogDiary();
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        for (Blog blog : result.getData()) {
            System.out.println(blog.getB_diary_title());
        }
    }
    //增加博客
    @Test
    public void testAddBlog(){
        NoteResult<Blog> result = service.addBlog("demo12","ceshi4444","123456");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    //删除博客
    @Test
    public void testDelBlogs(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        NoteResult<Object> result = service.delBlogs(list);
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    //修改
    @Test
    public void testModifyBlog(){
        NoteResult<Object> result = service.modifyBlog("1","demo04","123","123");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
    //查询
    @Test
    public void testSearchList(){
        NoteResult<List<Blog>> result = service.searchList("demo");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        for (Blog blog : result.getData()) {
            System.out.println(blog.getB_diary_title());
        }
    }
}
