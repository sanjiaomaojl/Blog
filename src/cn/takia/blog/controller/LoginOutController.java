package cn.takia.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/blog")
public class LoginOutController {
    @RequestMapping("/loginOut.do")
    public String loginOut(HttpServletRequest request,HttpServletResponse response, SessionStatus session) {
        //清除session
        request.getSession().getAttributeNames();
        request.getSession().invalidate();//清除 session 中的所有信息
        //退出登录的时候清空cookie信息,cookie需要通过HttpServletRequest，HttpServletResponse获取
        Cookie[] cookie = request.getCookies();
        for (Cookie c : cookie) {
            if ("autoLogin".equals(c.getName())) {
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }
        return null;
    }
}
