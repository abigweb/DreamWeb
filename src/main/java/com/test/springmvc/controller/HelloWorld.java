package com.test.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //声明为控制器
@RequestMapping("/Home")  //请求映射
public class HelloWorld {
	@RequestMapping("/SayHello")
	public String SayHi(Model model) {
		model.addAttribute("message", "Hello Spring MVC! home/helloworld");
		return "home/helloworld";
	}
}
