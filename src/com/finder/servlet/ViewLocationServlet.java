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
import com.finder.dao.LocationDao;

@WebServlet("/ViewLocationServlet")
public class ViewLocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ViewLocationServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocationDao locationDao =new  LocationDao();
		List<Location> l=locationDao.findAll();
		request.setAttribute("locationList",l);
		System.out.println(l);
		RequestDispatcher rd=request.getRequestDispatcher("listOfLocation.jsp");
		rd.forward(request, response);
		
		
	}

}
