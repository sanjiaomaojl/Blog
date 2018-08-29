package cn.takia.blog.dao;

import cn.takia.blog.entity.User;

public interface IsLoginDao {
    public User findByUserId(String bId);
}
