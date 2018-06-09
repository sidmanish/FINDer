package com.finder.servlet;

import java.io.IOException;
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


@WebServlet("/AddSProviderServlet")
public class AddSProviderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddSProviderServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServiceProviderDao	serviceProviderDao=new ServiceProviderDao();
	ServiceDao serviceDao =new ServiceDao();
	LocationDao  locationDao =new LocationDao();
	List<Services> s=serviceDao.findAll();
	List<Location>l=locationDao.findAll();
	request.setAttribute("serviceList",s);
	request.setAttribute("locationList",l);
	RequestDispatcher rd= request.getRequestDispatcher("addSProvider.jsp");
	rd.forward(request, response);
	
				
	}

}
