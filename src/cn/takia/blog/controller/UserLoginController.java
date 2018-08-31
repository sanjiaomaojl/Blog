package cn.takia.blog.controller;

import cn.takia.blog.entity.User;
import cn.takia.blog.service.UserService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户登录的Controller
 */
@Controller
@RequestMapping("/blog")  //匹配请求路径
public class UserLoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/login.do") //匹配请求
    @ResponseBody  //json格式输出
    public NoteResult<User> execute(String name,String password){
        NoteResult<User> result = userService.checkLogin(name,password);
        return result;
    }
}
