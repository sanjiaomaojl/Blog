package cn.takia.blog.dao;

import cn.takia.blog.entity.Blog;

public interface DiaryDao {
    public Blog findByDiaryId(String diaryId);
}
