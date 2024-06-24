package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
		
			
		Statement st=con.createStatement();
		PreparedStatement pst=con.prepareStatement("insert into productDemo values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int price =sc.nextInt();
			pst.setInt(1, id);
			pst.setString(2,name);
			pst.setInt(3, price);
			pst.execute();
			
		}
		
		ResultSet rs=st.executeQuery("select * from productDemo");
		ResultSetMetaData rsmd=rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i));
		}
		while(rs.next()) {
			System.out.print(rs.getString(1)+" "+rs.getString(2)+rs.getString(3));}
		con.close();
		
	}             

}
