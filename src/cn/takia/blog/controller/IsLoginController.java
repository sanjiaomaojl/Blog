package cn.takia.blog.controller;

import cn.takia.blog.entity.User;
import cn.takia.blog.service.IsLoginService;
import cn.takia.blog.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *判断用户是否登陆
 *
 */
@Controller
@RequestMapping("/blog")
public class IsLoginController {
    @Resource
    private IsLoginService loginService;

    @RequestMapping("/isLogin.do")
    @ResponseBody
    public NoteResult<User> execute(String bId){
        NoteResult<User> result = loginService.checkIsLogin(bId);
        return result;
    }
}
