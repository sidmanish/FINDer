package com.finder.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.finder.bean.ServiceProvider;
import com.finder.util.DBConnection;

public class ServiceProviderDao {
	public int save( ServiceProvider serviceProvider) {
		int result =0;
		try {
			Connection connection= DBConnection.dbConnection();
			PreparedStatement ps=connection.prepareStatement("insert into service_provider(name,mobile,adhar_no,service_id,address,location_id) values(?,?,?,?,?,?)");
			ps.setString(1,serviceProvider.getName() );
			ps.setString(2, serviceProvider.getMobile() );
			ps.setString(3, serviceProvider.getAdharNo());
			ps.setInt(4,serviceProvider.getServiceId());
			ps.setString(5, serviceProvider.getAddress());
			ps.setInt(6, serviceProvider.getLocationId());
			result =ps.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<ServiceProvider> findAll(){
		int result=0;
		ResultSet rs=null;
		ArrayList<ServiceProvider> al=new ArrayList<>();
		try {
			Connection Connection=DBConnection.dbConnection();
			PreparedStatement pst=Connection.prepareStatement("select * from service_provider");
			rs=pst.executeQuery();
			while(rs.next()) {
				ServiceProvider serviceProvider=new ServiceProvider();
				serviceProvider.setName(rs.getString("name"));
				serviceProvider.setMobile(rs.getString("mobile"));
				serviceProvider.setAdharNo(rs.getString("adhar_no"));
				serviceProvider.setServiceId(rs.getInt("service_id"));
				serviceProvider.setAddress(rs.getString("address"));
				serviceProvider.setLocationId(rs.getInt("location_id"));
				al.add(serviceProvider);
			}
			return al;
					
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return al;
	}
	public  List<ServiceProvider> findServiceProviderById(int id) {
		ResultSet rs=null;
		ArrayList<ServiceProvider> al=new ArrayList<>();
		try {
			Connection Connection=DBConnection.dbConnection();
			PreparedStatement pst=Connection.prepareStatement("select * from service_provider where service_id="+id);
			rs=pst.executeQuery();
			while(rs.next()) {
				ServiceProvider serviceProvider=new ServiceProvider();
				serviceProvider.setName(rs.getString("name"));
				serviceProvider.setMobile(rs.getString("mobile"));
				serviceProvider.setAdharNo(rs.getString("adhar_no"));
				serviceProvider.setServiceId(rs.getInt("service_id"));
				serviceProvider.setAddress(rs.getString("address"));
				serviceProvider.setLocationId(rs.getInt("location_id"));
				al.add(serviceProvider);
				
				
			}
			return  al;

		}catch(Exception e) {
				e.printStackTrace();
			}
		return al;
		
	}
public List<ServiceProvider> findServiceProviderByServiceLocationId( int serviceId, int locationId){
	ResultSet rs=null;
	ArrayList<ServiceProvider> al=new ArrayList<>();
	try {
		Connection Connection=DBConnection.dbConnection();
		PreparedStatement pst=Connection.prepareStatement("select * from service_provider where service_id=? and location_id=?");
		pst.setInt(1, serviceId);
		pst.setInt(2, locationId);
		System.out.println("prepared statement-->"+pst);
		rs=pst.executeQuery();
		while(rs.next()) {
			ServiceProvider serviceProvider=new ServiceProvider();
			serviceProvider.setName(rs.getString("name"));
			serviceProvider.setMobile(rs.getString("mobile"));
			serviceProvider.setAdharNo(rs.getString("adhar_no"));
			serviceProvider.setServiceId(rs.getInt("service_id"));
			serviceProvider.setAddress(rs.getString("address"));
			serviceProvider.setLocationId(rs.getInt("location_id"));
			al.add(serviceProvider);
			
			
		}
		System.out.println("service provider list"+al);
		return  al;
		}catch(Exception e) {
			e.printStackTrace();
		}
	return al;
	

		
	}
	


}