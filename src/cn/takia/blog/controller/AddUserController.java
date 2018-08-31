package cn.takia.blog.controller;

import cn.takia.blog.entity.User;
import cn.takia.blog.service.UserService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 增加用户的Controller
 */
@Controller
@RequestMapping("/blog")
public class AddUserController {
    @Resource
    private UserService userService;
    @RequestMapping("/addUser.do")
    @ResponseBody
    public NoteResult<User> execute(String name,String password){
        NoteResult<User> result = userService.addUser(name,password);
        return result;
    }
}
