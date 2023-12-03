package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	public HomePageController() {
		System.out.println("In Home page controller" + getClass().getName());
	}
	@GetMapping("/")
	public String getHomePage() {
		return "/index";
	}
}
