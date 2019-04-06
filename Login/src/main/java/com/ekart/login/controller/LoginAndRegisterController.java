package com.ekart.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginAndRegisterController {
	/*
	 * to show login page 
	 */
	@RequestMapping(value = "/showLoginPage", method = RequestMethod.GET)
	public String showLoginPage() {
		return "signin";
	}
}
