package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCode {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
	
	Statement st=con.createStatement();
	//st.executeUpdate("Create table EmpDetails(id number primary key, name varchar(20),city varchar(20),pin number)");
	//st.executeUpdate("insert into EmpDetails values (143,'Rahul','Mumbai',423553)");
	//st.executeUpdate("insert into EmpDetails values (132,'Manish','Pune',343435)");
	//st.executeUpdate("insert into EmpDetails values (145,'Vikas','Jaipur',446466)");
	System.out.println("Record inserted");
	
	ResultSet rs=st.executeQuery("select * from EmpDetails");
	
	while(rs.next()) {
	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
	}
	
	
	con.close();
		
		
		

	}

}
