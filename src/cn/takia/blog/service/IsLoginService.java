package cn.takia.blog.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;

/**
 * 判断用户是否登陆
 */
public interface IsLoginService {
    //判断用户是否登陆
    NoteResult<User> checkIsLogin(String bId);
}
