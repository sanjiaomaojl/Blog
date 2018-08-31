package cn.takia.blog.dao;

import cn.takia.blog.entity.User;

/**
 * 判断是否登录
 */
public interface IsLoginDao {
    //判断是否登录，通过cookie存入的用户ID
    public User findByUserId(String bId);
}
