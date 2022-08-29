package com.harxsh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService service = new LoginService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean isUserValid = service.validateUser(username, password);
		
		if (isUserValid) {
			req.setAttribute("username", req.getParameter("username"));
			req.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(req, res);
		}
		else {
			req.setAttribute("errorMessage", "Invalid login credentials!!");
			req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, res);
		}
	}
}