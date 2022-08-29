package com.harxsh.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLogin(
			@RequestParam String username,
			@RequestParam String password,
			ModelMap model
	) {
		boolean isValidUser = service.validateUser(username, password);
		if (!isValidUser) {
			model.put("errorMessage", "Invalid login credentials!!");
			return "login";
		}
		
		model.put("username", username);
		return "welcome";
	}
}
