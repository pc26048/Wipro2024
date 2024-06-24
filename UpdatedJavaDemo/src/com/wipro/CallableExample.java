package com.wipro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("oracle.jdbc.OracleDriver");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
	
	System.out.println("Connected");
	Statement st=con.createStatement();
	
	CallableStatement cs=con.prepareCall("{CALL addnumber(?,?,?)}");
	
	System.out.println("Enter 2 numbers: ");
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
	int q=s.nextInt();
	
	cs.setInt(1,p);
	cs.setInt(2, q);
	cs.registerOutParameter(3, Types.INTEGER);
	
	cs.execute();
	int ans=cs.getInt(3);
	
	System.out.println("Output of Callable statement is:"+ans);
	
	
	
	
	}

}
