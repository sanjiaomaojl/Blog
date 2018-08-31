package cn.takia.blog.controller;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 增加博客的Controller
 */
@Controller
@RequestMapping("/blog")
public class AddBlogController {
    @Resource
    private BlogService blogService;

    @RequestMapping("addBlog.do")
    @ResponseBody
    public NoteResult<Blog> execute(String title,String content,String showContent){
        NoteResult<Blog> result = blogService.addBlog(title,content,showContent);
        return result;
    }
}
