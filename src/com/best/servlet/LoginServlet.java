package com.best.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.model.LoginUser;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final String username = "kaungmyathtut";
    private final String password = "admin"; 
    
    public LoginServlet() {
       
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		out.print("Login Servlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.parseInt(request.getParameter("id"));
		String name =request.getParameter("name");
		String password =request.getParameter("password");
		String role=request.getParameter("role");
//		LoginUser user =new LoginUser(id,name,password,role);
		if(username.equals(name) && password.equals(password)) {
			Cookie loginCookie =new Cookie("password",password);
			loginCookie.setMaxAge(15*60);
			response.addCookie(loginCookie);
			response.sendRedirect("loginsuccess.jsp");
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("login.jsp");
        PrintWriter out = response.getWriter();
        out.println("<font color=red>The username and password that you entered did not match our records.Please double check and try again</font>");
        rd.include(request, response);
		
	}

}
