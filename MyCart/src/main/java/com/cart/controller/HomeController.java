package com.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(){
		System.out.println("in home method");
		return "home";
	}
	@RequestMapping("/register")
	public String signup(){
		System.out.println("in signup method");
		return "register";
	}

}
