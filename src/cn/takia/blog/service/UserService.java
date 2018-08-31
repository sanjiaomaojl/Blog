package cn.takia.blog.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;

/**
 * 用户Service层
 */
public interface UserService {
    //登录
    NoteResult<User> checkLogin(String name,String password);
    //增加用户
    NoteResult<User> addUser(String name,String password);
}
