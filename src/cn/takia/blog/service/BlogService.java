package cn.takia.blog.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;

import java.util.List;

public interface BlogService {
    public NoteResult<List<Blog>> loadBlogDiary();
    public NoteResult<List<Blog>> queryAllBlogDesc();
}
