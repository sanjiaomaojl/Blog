package cn.takia.blog.controller;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.service.DiaryService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/blog")
public class LoadDiaryController {
    @Resource
    private DiaryService diaryService;
    @RequestMapping("/content.do")
    @ResponseBody
    public NoteResult<Blog> execute(String diaryId){
        NoteResult<Blog> result = diaryService.loadDiary(diaryId);
        return result;
    }
}
