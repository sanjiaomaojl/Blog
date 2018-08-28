package cn.takia.blog.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;

public interface UserService {
    public NoteResult<User> checkLogin(String name,String password);
}
