package cn.takia.blog.dao;

import cn.takia.blog.entity.Blog;

/**
 *博客中日记的详细数据
 */
public interface DiaryDao {
    //根据博客ID查询数据
    Blog findByDiaryId(String diaryId);
}
