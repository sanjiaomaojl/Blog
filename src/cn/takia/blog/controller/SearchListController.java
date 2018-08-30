package cn.takia.blog.controller;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.BlogService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class SearchListController {
    @Resource
    private BlogService service;
    @RequestMapping("searchList.do")
    @ResponseBody
    public NoteResult<List<Blog>> execute(String title){
        NoteResult<List<Blog>> result = service.searchList(title);
        return result;
    }
}
