package cn.takia.blog.service;

import cn.takia.blog.dao.BlogDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.BlogUtil;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * BlogService层的实现
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService{
    @Resource
    private BlogDao blogDao;
    @Override
    //加载博客列表
    public NoteResult<List<Blog>> loadBlogDiary() {
        NoteResult<List<Blog>> result = new NoteResult<List<Blog>>();
        List<Blog> list = blogDao.findByDiary();
        result.setStatus(0);
        result.setMsg("查询博客成功");
        result.setData(list);
        return result;
    }

    @Override
    //加载博客列表，效力Controller
    public NoteResult<List<Blog>> queryAllBlogDesc() {
        NoteResult<List<Blog>> result = new NoteResult<List<Blog>>();
        List<Blog> list = blogDao.queryAllBlog();
        result.setStatus(0);
        result.setMsg("查询博客成功");
        result.setData(list);
        return result;
    }

    @Override
    //增加博客
    public NoteResult<Blog> addBlog(String title,String content,String showContent) {
        NoteResult<Blog> result = new NoteResult<Blog>();
        Blog blog = new Blog();
        //引用UUID创建ID
        String blog_id = BlogUtil.createId();
        blog.setB_diary_id(blog_id);
        blog.setB_diary_title(title);
        blog.setB_diary_body(content);
        blog.setB_diary_show_body(showContent);
        long now=System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        blog.setB_diary_create_time(sdf.format(now));
        blog.setB_diary_update_time(sdf.format(now));
        blogDao.addBlog(blog);
        //构建返回结果
        result.setStatus(0);
        result.setMsg("添加成功");
        result.setData(blog);
        return result;
    }

    @Override
    //批量删除
    public NoteResult<Object> delBlogs(List<String> ids) {
        NoteResult<Object> result = new NoteResult<Object>();
        //n是删除数据的数量
        int n = blogDao.delBlogs(ids);
        if(n>0){
            result.setStatus(0);
            result.setMsg("删除成功");
            return result;
        }else {
            result.setStatus(1);
            result.setMsg("删除失败");
            return result;
        }
    }

    @Override
    //修改博客
    public NoteResult<Object> modifyBlog(String diaryId, String title, String content, String showContent) {
        NoteResult<Object> result = new NoteResult<Object>();
        Blog blog = new Blog();
        blog.setB_diary_id(diaryId);
        blog.setB_diary_title(title);
        blog.setB_diary_body(content);
        blog.setB_diary_show_body(showContent);
        long now=System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        blog.setB_diary_update_time(sdf.format(now));
        blogDao.modifyBlog(blog);
        //构建返回结果
        result.setStatus(0);
        result.setMsg("更新成功");
        result.setData(blog);
        return result;
    }

    @Override
    //查询博客
    public NoteResult<List<Blog>> searchList(String title) {
        NoteResult<List<Blog>> result = new NoteResult<List<Blog>>();
        List<Blog> list = blogDao.searchList(title);
        result.setStatus(0);
        result.setMsg("查询博客成功");
        result.setData(list);
        return result;
    }
}
