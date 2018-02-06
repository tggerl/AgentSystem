package com.jbit.controller;

import com.jbit.entity.AsUser;
import com.jbit.service.AsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/1/31.
 */
@Controller
public class UserController {

    @Resource
    private AsUserService asUserService;

    @RequestMapping(value = "selLogin",method = RequestMethod.POST)
    @ResponseBody
    public String selectLogin(String usercode,String userpassword, HttpSession session){
        AsUser asUser = asUserService.selectLogin(usercode,userpassword);
        if (asUser!=null){
            session.setAttribute("currentUser",asUser);
            return "success";
        }else {
            return "用户名或密码错误！请重新输入";
        }
    }
    @RequestMapping(value = "exit")
    public String exit(HttpSession session){
        session.invalidate();
        return "index";
    }
}
