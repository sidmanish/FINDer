package com.finder.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.finder.bean.Services;
import com.finder.util.DBConnection;

public class ServiceDao {
	public int save(Services services) {
		int result =0;
		try {
		Connection 	connection= DBConnection.dbConnection();
		PreparedStatement ps=connection.prepareStatement("insert into service_master (service_name,description) values(?,?)");
		ps.setString(1, services.getServiceName());
		ps.setString(2, services.getDescription());
		result =ps.executeUpdate();

			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Services findById(int serviceId) {
		 Services  services=null;
		ResultSet rs =null;
		
		try {
		Connection 	connection= DBConnection.dbConnection();
		PreparedStatement ps=connection.prepareStatement("select * from service_master where id="+serviceId);
		rs = ps.executeQuery();
		while(rs.next()) {
			 services=new Services();
			 services.setId(rs.getInt("id"));
			 services.setServiceName(rs.getString("service_name"));
			 services.setDescription(rs.getString("description"));
			 return services;
			 
			
			
		}
			
		 return services;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return services;
		
	}
	
	
	public List<Services> findAll() {
		int result=0;
		ResultSet rs=null;
		ArrayList< Services> al=new ArrayList<>();
		try {
			Connection 	connection= DBConnection.dbConnection();
			PreparedStatement pst = connection.prepareStatement("select * from service_master");
			 rs=pst.executeQuery();
			 while(rs.next()) {
				 Services  services=new Services();
				 services.setId(rs.getInt("id"));
				 services.setServiceName(rs.getString("service_name"));
				 services.setDescription(rs.getString("description"));
				al.add(services);
			 }
			return al;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
	

}
