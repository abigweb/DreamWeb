package com.test.springmvc.controller;

import com.test.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller  //声明为控制器
@RequestMapping(path = "/user")  //请求映射
public class UserController {
    
    //@Autowired      // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    private UserService userService;
    
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model){
        model.addAttribute("list",userService.queryAllUsers());
        return "user/index";
    }
}
