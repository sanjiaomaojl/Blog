package cn.takia.blog.dao;

import cn.takia.blog.entity.User;

/**
 * 用户的相关操作
 */
public interface UserDao {
    //登录检查
    User findByName(String name);
    //注册
    void addUser(User user);
}
