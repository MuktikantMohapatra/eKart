package com.ekart.login.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
	public String home() {
		return "index";
	}
}
