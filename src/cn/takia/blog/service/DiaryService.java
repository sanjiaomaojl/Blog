package cn.takia.blog.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;

/**
 * 加载博客日记内容
 */
public interface DiaryService {
    //加载博客日记内容
    NoteResult<Blog> loadDiary(String diaryId);
}
