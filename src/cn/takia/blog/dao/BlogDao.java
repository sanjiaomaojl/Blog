package cn.takia.blog.dao;

import cn.takia.blog.entity.Blog;

import java.util.List;

/**
 * 关于博客内容修改的dao接口
 */
public interface BlogDao {
    //查询博客的数据
    List<Blog> findByDiary();
    //查询博客的数据，在Controller层返回数据不同
    List<Blog> queryAllBlog();
    //增加博客
    void addBlog(Blog blog);
    //批量删除博客
    int delBlogs(List<String> ids);
    //修改博客
    int modifyBlog(Blog blog);
    //模糊查询博客列表
    List<Blog> searchList(String title);
}
