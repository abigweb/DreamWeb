package com.springmvc.controller;

import java.util.List;

import com.springmvc.model.User;
import com.springmvc.service.IUserService;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    
    @Autowired
    @Qualifier("userService")   //名字要对应
    //@Resource(name = "userService")
    private IUserService service;
    
    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("message", service.findUserById(1).getUsername());
        return "home/hello";
    }
    
    @RequestMapping(value = "/user.do", method = RequestMethod.GET)
    public String userpage( User user) {
        return "user/index";
    }
    
    @RequestMapping(value ="/toJson.do",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
        service.addUser(user);
        return service.findUserById(2);
    }
    
    @RequestMapping(value="/nice.do",method = RequestMethod.GET)
    @ResponseBody
    public List<User> nice(Model model){
        return service.getAllUsers();
    }
}