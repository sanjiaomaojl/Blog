package cn.takia.blog.dao;

import cn.takia.blog.entity.User;

public interface UserDao {
    public User findByName(String name);
}
