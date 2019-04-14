package com.ekart.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ekart.login.entities.EkartUser;
import com.ekart.login.service.LoginServiceImpl;

@Controller
public class LoginAndRegisterController {
	@Autowired
	private LoginServiceImpl loginService;

	/*
	 * to show registration page
	 */
	@RequestMapping(value = "/showRegistrationPage", method = RequestMethod.GET)
	public String showRegistrationPage() {
		System.out.println("LoginAndRegisterController.showRegistrationPage()");
		return "registration";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute EkartUser user) {
		System.out.println("LoginAndRegisterController.registerUser()::::::::::Before");
		loginService.registerUser(user);
		System.out.println("LoginAndRegisterController.registerUser()::::::::::After");
		return "userDashBoard";
	}

	/*
	 * to show login page
	 */
	@RequestMapping(value = "/showLoginPage", method = RequestMethod.GET)
	public String showLoginPage() {
		System.out.println("LoginAndRegisterController.showLoginPage()");
		return "signin";
	}
}
