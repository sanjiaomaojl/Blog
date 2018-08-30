package cn.takia.blog.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;

import java.util.List;

public interface BlogService {
    NoteResult<List<Blog>> loadBlogDiary();
    NoteResult<List<Blog>> queryAllBlogDesc();
    NoteResult<Blog> addBlog(String title,String content,String showContent);
    NoteResult<Object> delBlogs(List<String> ids);
    NoteResult<Object> modifyBlog(String diaryId, String title,String content,String showContent);
    NoteResult<List<Blog>> searchList(String title);
}
