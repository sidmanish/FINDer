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
import com.finder.dao.ServiceProviderDao;

/**
 * Servlet implementation class ViewSProviderServlet
 */
@WebServlet("/ViewSProviderServlet")
public class ViewSProviderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSProviderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServiceProviderDao serviceProviderDao =new ServiceProviderDao();
		List<ServiceProvider> l=serviceProviderDao.findAll();
		request.setAttribute("serviceProviderList", l);
		RequestDispatcher rd=request.getRequestDispatcher("listOfSProvider.jsp");
		rd.forward(request, response);
	}

}
