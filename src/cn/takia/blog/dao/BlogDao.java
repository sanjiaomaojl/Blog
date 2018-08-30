package cn.takia.blog.dao;

import cn.takia.blog.entity.Blog;

import java.util.List;

public interface BlogDao {
    List<Blog> findByDiary();
    List<Blog> queryAllBlog();
    void addBlog(Blog blog);
    int delBlogs(List<String> ids);
    int modifyBlog(Blog blog);
    List<Blog> searchList(String title);
}
