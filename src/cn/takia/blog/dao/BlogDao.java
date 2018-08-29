package cn.takia.blog.dao;

import cn.takia.blog.entity.Blog;

import java.util.List;

public interface BlogDao {
    public List<Blog> findByDiary();
    public List<Blog> queryAllBlog();
}
