package cn.takia.blog.test.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.DiaryService;
import cn.takia.blog.test.TestBase;
import cn.takia.blog.util.NoteResult;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDiaryService extends TestBase {
    private DiaryService service;

    @Before
    public void init(){
        service = super.getContext().getBean("diaryService",DiaryService.class);
    }
    //日记的内容
    @Test
    public void testLoadDiary(){
        NoteResult<Blog> result = service.loadDiary("1");
        System.out.println(result.getStatus());
        System.out.println(result.getMsg());
        System.out.println(result.getData());
    }
}
