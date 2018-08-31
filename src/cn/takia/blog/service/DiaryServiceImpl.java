package cn.takia.blog.service;

import cn.takia.blog.dao.DiaryDao;
import cn.takia.blog.entity.Blog;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 加载博客日记内容的实现
 */
@Service("diaryService")
public class DiaryServiceImpl implements DiaryService{
    @Resource
    private DiaryDao diaryDao;
    @Override
    public NoteResult<Blog> loadDiary(String diaryId) {
        NoteResult<Blog> result = new NoteResult<Blog>();
        //通过查询判断
        Blog blog = diaryDao.findByDiaryId(diaryId);
        if (blog == null){
            result.setStatus(1);
            result.setMsg("文章不存在");
            return result;
        }else {
            result.setStatus(0);
            result.setMsg("查询");
            result.setData(blog);
            return result;
        }
    }
}
