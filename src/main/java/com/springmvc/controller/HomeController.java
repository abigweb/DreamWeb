package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //声明为控制器
public class HomeController {
    @RequestMapping(path = "/home.do")  //请求映射
    public String home(Model model) {
        model.addAttribute("message", "Hello，你好！ 请求了index页面");
        return "home/hello";
    }
    @RequestMapping(path = "/videos.do")  //请求映射
    public String videos(Model model) {
        model.addAttribute("message", "Hello,你好！ 请求了videos页面");
        return "home/hello";
    }
}