package com.finder.dao;

import java.sql.*;

import com.finder.bean.Login;
import com.finder.util.DBConnection;

public class LoginDao {
	public int save(Login login) {
		int result = 0;
		try {
			Connection connection = DBConnection.dbConnection();
			PreparedStatement ps = connection.prepareStatement("insert into login(username,password)values(?,?)");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}

	public Login validate(Login login) {
		Login login2=null;
		
		try {
			Connection connection = DBConnection.dbConnection();
			PreparedStatement pst = connection.prepareStatement("select * from login where username =? and password = ?");
			pst.setString(1,login.getUsername());
			pst.setString(2,login.getPassword());
			ResultSet rs= pst.executeQuery();
			if(rs==null)
				return login2;
			else {
				while(rs.next()) {
					login2 = new Login();
				login2.setId(rs.getInt("id"));
				login2.setUsername(rs.getString("username"));
				login2.setPassword(rs.getString("password"));
				
				return login2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return login2;
		}
		
		return login2;
		
	}

}
