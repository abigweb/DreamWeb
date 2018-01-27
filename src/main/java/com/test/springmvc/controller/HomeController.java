package com.test.springmvc.controller;

import com.test.springmvc.entity.User;
import com.test.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller  //声明为控制器
public class HomeController {
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model) {
        model.addAttribute("message", "Hello，你好！ 请求了index页面");
        return "home/hello";
    }
    @RequestMapping(path = "/videos")  //请求映射
    public String videos(Model model) {
        model.addAttribute("message", "Hello,你好！ 请求了videos页面");
        return "home/hello";
    }
    
    @RequestMapping(path = "/user")  //请求映射
    public String user(Model model){
        UserService userService = new UserService();
        List<User> users = userService.queryAllUsers();
        model.addAttribute("list",users);
        return "user/index";
    }
}