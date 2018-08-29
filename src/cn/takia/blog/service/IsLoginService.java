package cn.takia.blog.service;

import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;

public interface IsLoginService {
    public NoteResult<User> checkIsLogin(String bId);
}
