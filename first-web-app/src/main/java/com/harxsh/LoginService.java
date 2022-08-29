package com.harxsh;

public class LoginService {

	public boolean validateUser(String username, String password) {
		return "harxsh".equals(username) && "somepassword".equals(password);
	}
}
