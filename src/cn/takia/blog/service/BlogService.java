package cn.takia.blog.service;

import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;

import java.util.List;

/**
 * 关于博客的Service层代码
 */
public interface BlogService {
    //加载博客列表
    NoteResult<List<Blog>> loadBlogDiary();
    //加载博客列表，效力Controller
    NoteResult<List<Blog>> queryAllBlogDesc();
    //增加博客
    NoteResult<Blog> addBlog(String title,String content,String showContent);
    //批量删除
    NoteResult<Object> delBlogs(List<String> ids);
    //修改博客
    NoteResult<Object> modifyBlog(String diaryId, String title,String content,String showContent);
    //查询博客
    NoteResult<List<Blog>> searchList(String title);
}
