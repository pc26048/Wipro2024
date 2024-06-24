package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTasks {

	static void addProduct(int id,String name,double price,int quantity) throws SQLException {

		String query="insert into product1 (id,name,price,quantity) values (?,?,?,?)";
		try {
			
		Connection con = DatabaseDriverConnection.getConnection();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setDouble(3, price);
		pst.setInt(4, quantity);
		pst.executeUpdate();
		System.out.println("Product inserted successfully...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void viewProduct() throws SQLException {
		
		try {
		String query="select * from product1";
		Connection con=DatabaseDriverConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void updateProduct(int id,String name,double price,int quantity) throws SQLException {
		
		
		try {
		String query="update product1 set name= ?, price= ?, quantity=? where id=?";
		
		Connection con=DatabaseDriverConnection.getConnection();
		
		PreparedStatement pst=con.prepareStatement(query);
		
		pst.setString(1, name);
		pst.setDouble(2, price);
		pst.setInt(3, quantity);
		pst.setInt(4, id);
		
		pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Record updated successfully...");
		
		
	}
	
	
	static void deleteAll() throws SQLException {
		
		try {
		String query="delete from product1";
		Connection con=DatabaseDriverConnection.getConnection();
		
		Statement st=con.createStatement();
		st.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("All products deleted successfully...");
		
		
	}

	static void deleteProduct(int id) throws SQLException {
		
		
		try {

		String query = "delete from product1 where id=?";
		Connection con = DatabaseDriverConnection.getConnection();
		

		PreparedStatement pst=con.prepareStatement(query);
		
		pst.setInt(1, id);
		pst.executeUpdate();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Product with id: "+id+" deleted successfully...");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con = DatabaseDriverConnection.getConnection();

		Statement st = con.createStatement();
		

		//st.executeUpdate("create table product1(id number primary key,name varchar(20) not null,price number,quantity number)");

		System.out.println("Connected....");
		
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 for insert a new product");
			System.out.println("Enter 2 for update a product");
			System.out.println("Enter 3 for delete a product");
			System.out.println("Enter 4 for delete all product");
			System.out.println("Enter 5 for exit this App");
			System.out.println("Enter your choice: ");
			
			int choice=s.nextInt();
			s.nextLine();
			
			switch(choice) {
			
			case 1:
				System.out.print("Enter the product id: ");
				int prodId=s.nextInt();
				s.nextLine();
				System.out.println("Enter product name: ");
				String name=s.nextLine();
				System.out.println("Enter product price: ");
				double price =s.nextDouble();
				System.out.println("Enter product quantity: ");
				int quantity=s.nextInt();
				addProduct(prodId,name,price,quantity);
				System.out.println("Product List:----------------");
				
				viewProduct();
				
				break;
			case 2:
				System.out.print("Enter the product id to update: ");
				int id=s.nextInt();
				s.nextLine();
				System.out.print("Enter new product name: ");
				String prodName=s.nextLine();
				System.out.print("Enter new product price: ");
				double prodPrice=s.nextDouble();
				System.out.print("Enter new quantity for product: ");
				int quant=s.nextInt();
				updateProduct(id,prodName,prodPrice,quant);
				
				System.out.println("Product List:-----------------");
				viewProduct();
				break;
				
			case 3:
				System.out.print("Enter product id to delete: ");
				int deleteId=s.nextInt();
				
				deleteProduct(deleteId);
				System.out.println("Product List:------------------");
				viewProduct();
				break;
				
			case 4:
				
				deleteAll();
				break;
			case 5:
				System.out.println("Exiting...");
				con.close();
				s.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again...");
				
				
			}
					
		}
		
	}

}
