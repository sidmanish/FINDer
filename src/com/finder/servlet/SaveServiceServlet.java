package com.finder.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.Services;
import com.finder.dao.ServiceDao;


@WebServlet("/SaveServiceServlet")
public class SaveServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveServiceServlet() {
        super();
        
    }

	
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serviceName=request.getParameter("serviceName");
		String description =request.getParameter("description");
		Services serviceMaster =new Services(serviceName,description);
		ServiceDao serviceMasterDao =new ServiceDao();
		int reult=serviceMasterDao.save(serviceMaster);
		System.out.println(reult);
		RequestDispatcher rd=request.getRequestDispatcher("addService.jsp");
		rd.forward(request, response);
		
		
		
	
	}

}
