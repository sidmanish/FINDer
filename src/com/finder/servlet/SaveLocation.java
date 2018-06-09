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


@WebServlet("/SaveLocation")
public class SaveLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveLocation() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String locationName =request.getParameter("locationName");
		Location location =new Location(locationName);
		LocationDao locationDao =new LocationDao();
		boolean result = locationDao.save(location);
		if(result==true){
			System.out.println("location successfully inserted");
		}else {
			System.out.println("Could not insert location");
		}
		System.out.println(result);
		List<Location> locationList = locationDao.findAll();
		request.setAttribute("locationList", locationList);
		RequestDispatcher rd= request.getRequestDispatcher("listOfLocation.jsp");
		rd.forward(request, response);
		
		
	}

}
