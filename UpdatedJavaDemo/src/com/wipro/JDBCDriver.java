package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDriver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");

		System.out.println("Connection successful...");
		Statement st= con.createStatement();
	//st.executeUpdate("create table productDemo(id number primary key,name varchar(20),price number)");
	//st.executeUpdate("insert into productDemo values(103,'pen',199)");
	//	st.executeUpdate("insert into productDemo values(104,'car',200)");
		
		
		System.out.println("Data Received...");
		
		
		ResultSet rs=st.executeQuery("select * from productDemo");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		
		
		con.close();
			
     		

	}

}
