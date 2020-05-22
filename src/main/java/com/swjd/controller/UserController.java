package com.swjd.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swjd.bean.User;
import com.swjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Model model, User user, HttpSession session){
        //条件构造器
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("uname",user.getUname());
        queryWrapper.eq("password",user.getPassword());
        User u=userService.getOne(queryWrapper);
        if (u!=null){
            if (u.getFlag().equals("1")){
                session.setAttribute("activeName",u.getUname());
                return "main";
            }else {
                model.addAttribute("errorMsg","账号被冻结,请联系客服");
                model.addAttribute("user",user);
                return "login";
            }
        }else {
            model.addAttribute("errorMsg","账号或者密码不正确");
            model.addAttribute("user",user);
            return "login";
        }
    }

    @RequestMapping("/toMy")
    public String toMy(){
        return "myTaoBao";
    }

    @RequestMapping("/toCar")
    public String toCar(){
        return "shoppingCar";
    }
}
