package com.best.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.best.dao.BookStoreDao;
import com.book.model.Register;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static BookStoreDao bookStoreDao;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
       
        // TODO Auto-generated constructor stub
        bookStoreDao =new BookStoreDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
//		Integer id=Integer.parseInt(request.getParameter("id"));
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		
		Register register =new Register(0, username, password, confirmpassword);
		
		if(confirmpassword!=null && confirmpassword.equals(password)) {
			out.print(confirmpassword);
			out.print(password);
			
			try {
				String message="";
				boolean result=bookStoreDao.saveRegister(register);
				out.print(result);
				if(result) {
					message="Successful saving!";
				}else {
					message="Sorry,save failed";
				}
				
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				request.setAttribute("message", message);				
				rd.forward(request, response);
		
				
			}catch(Exception e) {
				e.getMessage();
			}
		}
		else {
			RequestDispatcher r=request.getRequestDispatcher("register.html");
			r.forward(request, response);
		}
		
	}

}
