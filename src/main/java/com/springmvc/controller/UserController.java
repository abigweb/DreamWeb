package com.springmvc.controller;

import com.springmvc.model.User;
import com.springmvc.service.IUserService;
import com.springmvc.service.UserServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    
    private IUserService service = new UserServiceImpl();
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("message", service.findUserById(1).getUsername());
        return "home/hello";
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userpage( User user) {
        return "user/index";
    }
    
    @RequestMapping(value ="/toJson",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(User user){
        service.addUser(user);
        return service.findUserById(2);
    }
    
    ///////////////////////
    @RequestMapping(value="nice",method = RequestMethod.GET)
    @ResponseBody
    public List<User> nice(Model model){
        return service.getAllUsers();
    }
}