package com.finder.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.ContactUs;
import com.finder.dao.ContactUsDao;


@WebServlet("/SaveContact")
public class SaveContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String subject= request.getParameter("subject");
		String message= request.getParameter("message");
		
		ContactUs contactUs = new ContactUs(name, email, subject, message);
		
		ContactUsDao contactUsDao = new ContactUsDao();
		int result=contactUsDao.save(contactUs);
		System.out.println(result);
	
		RequestDispatcher rd = request.getRequestDispatcher("contact.jsp");
		rd.forward(request, response);
	}

}
