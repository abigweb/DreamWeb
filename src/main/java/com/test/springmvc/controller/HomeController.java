package com.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //声明为控制器
@RequestMapping(path = {"Home","home","First","first"})  //请求映射
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
}
