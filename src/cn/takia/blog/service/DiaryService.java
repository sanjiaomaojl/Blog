package cn.takia.blog.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;

public interface DiaryService {
    public NoteResult<Blog> loadDiary(String diaryId);
}
