package cn.takia.blog.test.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.DiaryService;
import cn.takia.blog.util.NoteResult;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDiaryService {
    DiaryService service;
    @Test
    public void test(){
        String[] conf = {"conf/spring-mybatis.xml", "conf/spring-mvc.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(conf);
        service = ctx.getBean("diaryService",DiaryService.class);
        NoteResult<Blog> result = service.loadDiary("1");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
