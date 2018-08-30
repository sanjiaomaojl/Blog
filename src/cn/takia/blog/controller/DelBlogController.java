package cn.takia.blog.controller;

import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/blog")
public class DelBlogController {
    @Resource
    private BlogService service;
    @RequestMapping("/delBlogs.do")
    @ResponseBody
    public NoteResult<Object> execute(@RequestParam("ids")List<String> ids){
        NoteResult<Object> result = service.delBlogs(ids);
        return result;
    }
}
