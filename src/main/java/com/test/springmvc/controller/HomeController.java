package com.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //声明为控制器
@RequestMapping(path = {"/", "Home", "First"})  //请求映射
public class HomeController {
    @RequestMapping(path = "/index")  //请求映射
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring MVC!");
        return "home/index";
    }
    
    @RequestMapping(path = "/")  //请求映射
    public String first(Model model) {
        model.addAttribute("message", "Hello Spring MVC,Welcome Page!");
        return "home/index";
    }
}
