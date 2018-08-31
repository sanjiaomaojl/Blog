package cn.takia.blog.service;

import cn.takia.blog.dao.IsLoginDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 判断用户是否登陆的实现
 */
@Service("isLoginService")
public class IsLoginServiceImpl implements IsLoginService{
    @Resource
    private IsLoginDao isLoginDao;
    @Override
    public NoteResult<User> checkIsLogin(String bId) {
        NoteResult<User> result = new NoteResult<User>();
        User user = isLoginDao.findByUserId(bId);
        if (user == null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }else {
            result.setStatus(0);
            result.setMsg("登录成功");
            result.setData(user);
            return result;
        }
    }
}
