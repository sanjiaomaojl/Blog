package cn.takia.blog.service;

import cn.takia.blog.dao.BlogDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
    @Resource
    private BlogDao blogDao;
    @Override
    public NoteResult<List<Blog>> loadBlogDiary() {
        NoteResult<List<Blog>> result = new NoteResult<List<Blog>>();
        List<Blog> list = blogDao.findByDiary();
        result.setStatus(0);
        result.setMsg("查询博客成功");
        result.setData(list);
        return result;
    }

    @Override
    public NoteResult<List<Blog>> queryAllBlogDesc() {
        NoteResult<List<Blog>> result = new NoteResult<List<Blog>>();
        List<Blog> list = blogDao.queryAllBlog();
        result.setStatus(0);
        result.setMsg("查询博客成功");
        result.setData(list);
        return result;
    }
}
