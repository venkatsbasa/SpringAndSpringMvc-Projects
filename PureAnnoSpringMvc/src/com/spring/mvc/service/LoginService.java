package com.spring.mvc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {

	public Connection derbyConnection() {
		Connection con = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con = DriverManager.getConnection("jdbc:derby://localhost:1527/venkatsdb", "venkats", "user");
			System.out.println("con"+con.getSchema());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
	public boolean isValidUser(String un,String pwd) throws SQLException {
		boolean flag=false;
		Connection con=derbyConnection();
		if(con!=null) {
			System.out.println("connecton established");
			PreparedStatement ps=con.prepareStatement("select user_name,user_pwd from USERTABLE where user_name=? and user_pwd=?");
			ps.setString(1, un);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				flag=true;
			}
		}
		
		return flag;
	}
}
