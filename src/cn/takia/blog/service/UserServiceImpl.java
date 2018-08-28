package cn.takia.blog.service;

import cn.takia.blog.dao.UserDao;
import cn.takia.blog.entity.User;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")//扫描spring容器
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public NoteResult<User> checkLogin(String name, String password) {
        NoteResult<User> result = new NoteResult<User>();
        User user = userDao.findByName(name);
        if (user == null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        if (!user.getCn_user_password().equals(password)){
            result.setStatus(2);
            result.setMsg("密码错误");
            return result;
        }
        //用户名密码都正确
        result.setStatus(0);
        result.setMsg("登录成功");
        result.setData(user);
        return result;
    }
}
