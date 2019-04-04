package com.ekart.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	/*
	 * to show login page 
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showLoginPage() {
		return "login";
	}
}
