package com.harxsh.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String username, String password) {
		return "harxsh".equals(username) && "somepassword".equals(password);
	}
}
