package com.finder.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.Location;
import com.finder.bean.ServiceProvider;
import com.finder.bean.Services;
import com.finder.dao.LocationDao;
import com.finder.dao.ServiceDao;
import com.finder.dao.ServiceProviderDao;


@WebServlet("/FindServiceProviderByServiceLocationId")
public class FindServiceProviderByServiceLocationId extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FindServiceProviderByServiceLocationId() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int serviceId = Integer.parseInt(request.getParameter("service_id"));
		int locationId = Integer.parseInt(request.getParameter("location_id"));
		ServiceProviderDao serviceProviderDao =new ServiceProviderDao();
		List<ServiceProvider> listOfServiceProvider = serviceProviderDao.findServiceProviderByServiceLocationId(serviceId,locationId);
		request.setAttribute("serviceProviderList", listOfServiceProvider);
		
		LocationDao locationDao =new LocationDao();
		List<Location> locationList = locationDao.findAll();
		
		request.setAttribute("locationList", locationList);
		ServiceDao serviceDao =new ServiceDao();
		List<Services> serviceList = serviceDao.findAll();
		
		request.setAttribute("serviceList", serviceList);
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("viewServiceProviderByServiceLocation.jsp");
		rd.forward(request, response);
		
		
	}
}
