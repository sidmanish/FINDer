package com.finder.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.ServiceProvider;
import com.finder.bean.Services;
import com.finder.dao.ServiceDao;
import com.finder.dao.ServiceProviderDao;


@WebServlet("/FindServiceProviderByIdServlet")
public class FindServiceProviderByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FindServiceProviderByIdServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int serviceId=Integer.parseInt(request.getParameter("id"));
		ServiceProviderDao  serviceProviderDao=new ServiceProviderDao();
		List<ServiceProvider>serviceProviderList=serviceProviderDao.findServiceProviderById(serviceId);
		
		ServiceDao serviceDao = new ServiceDao();
		Services services=serviceDao.findById(serviceId);  
		System.out.println(services);
		request.setAttribute("serviceName",services.getServiceName());
		request.setAttribute("serviceProviderList",serviceProviderList);
		RequestDispatcher rd=request.getRequestDispatcher("serviceProvider.jsp");
		rd.forward(request, response);
		
		
		
	}

}
