package cn.takia.blog.controller;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.entity.User;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogListController {
    @Resource
    private BlogService service;

    @RequestMapping("/list.do") //匹配请求
    @ResponseBody  //json格式输出
    public NoteResult<List<Blog>> execute(){
        NoteResult<List<Blog>> result = service.loadBlogDiary();
        return result;
    }

    @RequestMapping("/blogList.do") //匹配请求
    @ResponseBody  //json格式输出
    public List<Blog> execute2(){
        NoteResult<List<Blog>> result = service.queryAllBlogDesc();
        return result.getData();
    }
}
