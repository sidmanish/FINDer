package com.finder.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.finder.bean.Location;
import com.finder.bean.Services;
import com.finder.util.DBConnection;

public class LocationDao {
	
	public boolean save(Location location) {
		boolean result =false;
		try {
			Connection connection =DBConnection.dbConnection();
			PreparedStatement ps=connection.prepareStatement("insert into location (location_name)values(?)");
			ps.setString(1,location.getLocationName());
			if(ps.executeUpdate()==1) {
				result=true;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}


public List<Location> findAll() {
	
	ResultSet rs=null;
	ArrayList<Location > al=new ArrayList<>();
	try {
		Connection 	connection= DBConnection.dbConnection();
		PreparedStatement pst = connection.prepareStatement("select * from location ");
		 rs=pst.executeQuery();
		 while(rs.next()) {
			 Location  location=new Location();
			 location.setId(rs.getInt("id"));
			location.setLocationName(rs.getString("location_name"));
			al.add(location);
		 }
		return al;
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return al;
}

}
