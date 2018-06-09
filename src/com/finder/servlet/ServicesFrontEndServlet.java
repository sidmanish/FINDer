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

@WebServlet("/ServicesFrontEndServlet")
public class ServicesFrontEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServicesFrontEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceDao serviceDao = new ServiceDao();
		List<Services> serviceList = serviceDao.findAll();
		request.setAttribute("serviceList", serviceList);
		RequestDispatcher rd = request.getRequestDispatcher("services.jsp");
		rd.forward(request, response);
	}

}
