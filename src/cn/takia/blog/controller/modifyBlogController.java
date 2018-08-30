package cn.takia.blog.controller;

import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/blog")
public class modifyBlogController {
    @Resource
    private BlogService blogService;
    @RequestMapping("/modifyBlog.do")
    @ResponseBody
    public NoteResult<Object> execute(String diaryId, String title,String content,String showContent){
        NoteResult<Object> result = blogService.modifyBlog(diaryId,title,content,showContent);
        return result;
    }
}
