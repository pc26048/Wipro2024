package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriverConnection {

	
		// TODO Auto-generated method stub
		
		private static final String uri="jdbc:oracle:thin:@localhost:9501/XE";
		private static final String username="system";
		private static final String pass="rps@123";
		
		
		public static Connection getConnection() throws SQLException{
			return DriverManager.getConnection(uri,username,pass);
		}

}
