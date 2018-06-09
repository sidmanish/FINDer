package com.finder.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.Services;
import com.finder.dao.ServiceDao;

/**
 * Servlet implementation class ViewServiceServlet
 */
@WebServlet("/ViewServiceServlet")
public class ViewServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ViewServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ServiceDao  serviceDao=new ServiceDao();
		List <Services> l=serviceDao.findAll();
		request.setAttribute("serviceList", l);
		RequestDispatcher rd=request.getRequestDispatcher("listOfServices.jsp");
		rd.forward(request, response);
	}

}
