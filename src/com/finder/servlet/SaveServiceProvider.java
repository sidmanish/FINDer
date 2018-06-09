package com.finder.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.finder.bean.ServiceProvider;
import com.finder.dao.ServiceProviderDao;


@WebServlet("/SaveServiceProvider")
public class SaveServiceProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SaveServiceProvider() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("name");
		 String mobile=request.getParameter("mobile");
		 String adharNo=request.getParameter("adhar_no");
		 int serviceId =Integer.parseInt(request.getParameter("service_id"));
		 String address=request.getParameter("address");
		 int locationId =Integer.parseInt(request.getParameter("location_id"));
		 ServiceProvider serviceProvider =new ServiceProvider( name,mobile, adharNo, serviceId, address, locationId);
		 ServiceProviderDao serviceProviderDao =new ServiceProviderDao();
		 System.out.println(serviceProvider);
		 int result = serviceProviderDao.save(serviceProvider);
		 System.out.println(result);
		 RequestDispatcher rd=request.getRequestDispatcher("AddSProviderServlet");
		 rd.forward(request, response);
	}

}
