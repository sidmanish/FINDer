package com.finder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.finder.bean.ContactUs;
import com.finder.util.DBConnection;

public class ContactUsDao {

	public int save(ContactUs contactUs) {
		
		int result = 0;
		try {
			Connection connection = DBConnection.dbConnection();
			PreparedStatement ps = connection.prepareStatement("insert into contactus(name,email,subject,message) values(?,?,?,?)");
			ps.setString(1, contactUs.getName());
			ps.setString(2, contactUs.getEmail());
			ps.setString(3, contactUs.getSubject());
			ps.setString(4, contactUs.getMessage());
			result=ps.executeUpdate();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	

}
